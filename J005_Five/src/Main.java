public class Main {
    public static void main(String[] args) {
        IFactory factory = FactoryBuilder.getInstance();
        IProvider provider = factory.getProvider();
        IPrinter printer = factory.getPrinter();
        printer.setProvider(provider);
        printer.print();
    }
}