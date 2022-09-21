public class AliVeliRU implements IProvider {
    @Override
    public String getMessage() {
        return "Привет, мир!";
    }

    @Override
    public String getErrorMessage() {
        return null;
    }
}
