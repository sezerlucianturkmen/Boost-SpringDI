public class A {
    private String message="Hello World";
   @Deprecated
    public String getMessage(){
        return message;
    }
    public String getErrorMessage(){
       return "Error....: "+message;
    }
    public String getStandardMessage(){
        return "Standard....: "+message;
    }
}
