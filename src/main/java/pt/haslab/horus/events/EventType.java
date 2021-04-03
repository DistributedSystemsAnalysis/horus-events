package pt.haslab.horus.events;

public enum EventType {
    CREATE(1, "CREATE"),
    START(2, "START"),
    END(3, "END"),
    JOIN(4, "JOIN"),
    LOG(5, "LOG"),
    SND(8, "SND"),
    RCV(9, "RCV"),
    CONNECT(11, "CONNECT"),
    ACCEPT(12, "ACCEPT"),
    FSYNC(13, "FSYNC");

    private final String label;
    private int code;

    EventType(int code, String label) {
        this.code = code;
        this.label = label;
    }

    public int getCode() {
        return code;
    }

    public String getLabel() {
        return label;
    }

    public static EventType getEventType(int code) {
        for (EventType type : values()) {
            if (type.code == code)
                return type;
        }

        throw new IllegalArgumentException("The given Event Type code [" + code + "] is invalid.");
    }
}