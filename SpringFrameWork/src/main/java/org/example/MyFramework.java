package org.example;

public class MyFramework {
    private IProvider provider;
    private IPrinter printer;

    public MyFramework(){

    }

    /**
     * getPrinterInstance ->
     * @return
     */
    public Object getObjectInstance(String ClassNameOne, String ClassNameTwo){
        Object oOne = null;
        Object oTwo = null;
        try{
            oOne = Class.forName(ClassNameOne).getDeclaredConstructor().newInstance();
            oTwo = Class.forName(ClassNameTwo).getDeclaredConstructor().newInstance();

        }catch (Exception e){
            e.printStackTrace();
        }
        if(oOne instanceof IPrinter){
            printer = (IPrinter) oOne;
        }
        if(oTwo instanceof IProvider){
            provider = (IProvider) oTwo;
        }
        printer.setProvider(provider);
        return printer;
    }
}
