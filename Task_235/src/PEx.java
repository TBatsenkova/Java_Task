public class PEx extends Exception{
    private String message = "Exception: it must be only fore persons in the car.";

    @Override
    public String getMessage() {
        return message;
    }
}
