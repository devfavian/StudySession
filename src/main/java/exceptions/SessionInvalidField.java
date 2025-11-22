package exceptions;

public class SessionInvalidField extends RuntimeException {

    public SessionInvalidField(String fieldName) {
        super(buildMessage(fieldName));
    }

    private static String buildMessage(String fieldName) {
        switch (fieldName) {
            case "subject":
                return "Subject must be between 3 and 50 characters";
            case "durationMinutes":
                return "Duration must be between 1 and 600 minutes";
            case "focusLevel":
                return "Focus level must be between 1 and 5";
            default:
                return "Invalid field: " + fieldName;
        }
    }
}
