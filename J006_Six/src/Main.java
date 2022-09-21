public class Main {
    public static void main(String[] args) {
        MyFramework myFramework = new MyFramework();
        IPrinter printer =  (IPrinter)
                myFramework.getObjectInstance("ErrorPrinter","AliVeliRU");
        printer.print();
    }
}