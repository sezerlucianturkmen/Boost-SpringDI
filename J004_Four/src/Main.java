public class Main {
    public static void main(String[] args) {
        /**
         * mesaj sağlama sözleşmesi
         * TR yada En fakrlı dillerde bir sözleşme imzalanır
         */
        IProvider provider;
        IPrinter printer;
        /**
         * mesajları sağlanmış olur
         */
        provider=new MessageProviderEN();
        printer=new StandardPrinter();
        printer.setProvider(provider);
        printer.print();
        provider=new MessageProviderTR();
        printer=new ErrorPrinter();
        printer.setProvider(provider);
        printer.print();
    }
}