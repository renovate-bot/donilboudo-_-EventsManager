package ca.beogotechnologies.util.messages;

import java.util.ArrayList;
import java.util.List;

public class Message {
    private final String code;
    private final String message;
    private String stack;
    private final MessageType type;
    private List<MessageField> fields = new ArrayList<>();

    Message(String code, String message, MessageType type) {
        this.code = code;
        this.message = message;
        this.type = type;
    }

    public Message(String code, String message, MessageType type, List<MessageField> fields) {
        this.code = code;
        this.message = message;
        this.type = type;
        this.fields = fields;
    }

    public void add(String field, String message) {
        fields.add(new MessageField(field, message));
    }

    public String getMessage() {
        return message;
    }

    public String getCode() {
        return code;
    }

    public MessageType getType() {
        return type;
    }

    public List<MessageField> getFields() {
        return fields;
    }

    public String getStack() {
        return stack;
    }

    public void setStack(String stack) {
        this.stack = stack;
    }
}
