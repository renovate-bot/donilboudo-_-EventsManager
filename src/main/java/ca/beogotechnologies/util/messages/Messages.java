package ca.beogotechnologies.util.messages;

public class Messages {
    public static final Message ENTITY_PROPERTY_INVALID = new Message("E0001", "The entity property you provided is invalid", MessageType.ERROR);
    public static final Message ENTITY_ALREADY_EXISTS = new Message("E0002", "Existing entity may not be created", MessageType.ERROR);
    public static final Message PRIMARY_KEY_ALREADY_EXISTS = new Message("E0003", "A primary key already exists", MessageType.ERROR);
    public static final Message DATA_INTEGRITY_ERROR = new Message("E8000", "The entity you try to delete/update cannot be perform", MessageType.ERROR);
    public static final Message SERVER_ERROR = new Message("E9000", "Internal Server Error", MessageType.ERROR);

}
