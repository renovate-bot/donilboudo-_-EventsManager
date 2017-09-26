package ca.beogotechnologies.util.messages;

public class MessageField {
    private final String name;
    private final String message;

    public MessageField(String field, String message) {
        this.name = field;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public String getMessage() {
        return message;
    }
}
