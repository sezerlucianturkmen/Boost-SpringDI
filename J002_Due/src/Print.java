public class Print {

    public void printMessage(MessageType type){
        switch (type){
            case STANDARD -> System.out.println("Standart Message");
            case ERROR -> System.err.println("Error Message");

        }
    }

}
