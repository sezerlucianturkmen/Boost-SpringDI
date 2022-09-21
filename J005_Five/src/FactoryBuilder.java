import java.io.FileInputStream;
import java.sql.Driver;
import java.util.Properties;

public class FactoryBuilder implements IFactory{
    private IProvider provider;
    private IPrinter printer;

    private static FactoryBuilder instance;

    static {

        instance = new FactoryBuilder();
    }

    public static FactoryBuilder getInstance() {
        return instance;
    }
    private Properties proterties;
    /**
     * ÖDEV: static, static{}, {}, constructor hangisi hangi sıra ile çalışıyor?
     */
    {
        /**
         * Bir property fodsyası üzerinde işlem yapmak için kullanılır.
         */
        proterties = new Properties();
        try{
            /**
             * ilgili dosyanızı alarak properies içine aktarırız böylece içinde var olan değerleri okuyabiliriz.
             */
            proterties.load(new FileInputStream("D:\\BİLGEADAM_JAVABOOST3_ANKARA\\SpringDI_Exam\\SpringDI\\J005_Five\\src\\application.properties"));
            /**
             * properti içinden ilgili sınflarımızın class isimlerini alıyoruz
             */
            String providerClass = proterties.getProperty("provider");
            String printerClass = proterties.getProperty("printer");
            /**
             * Buradan sonra belirlenen sınıfların birer instance si oluşturulmalı.             *
             */
            provider = (IProvider) Class.forName(providerClass).getDeclaredConstructor().newInstance();
            printer = (IPrinter) Class.forName(printerClass).getDeclaredConstructor().newInstance();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public IProvider getProvider() {
        return this.provider;
    }

    @Override
    public IPrinter getPrinter() {
        return this.printer;
    }
}
