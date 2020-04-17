package testha.demo.exception;

public class EntityNotFoundException extends RuntimeException {
    private static String message = "This entity does not exists";

    public EntityNotFoundException() {
        super(message);
    }

}
