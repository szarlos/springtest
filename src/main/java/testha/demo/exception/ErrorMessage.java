package testha.demo.exception;

public class ErrorMessage {
    private String message;

    public ErrorMessage(String message, String status) {
        this.message = message;
        this.status = status;
    }

    private String status;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
