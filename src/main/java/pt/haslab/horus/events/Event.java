package pt.haslab.horus.events;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import pt.haslab.horus.events.flatbuffers.generated.FalconEvent;

import java.util.Map;

public abstract class Event {

    protected EventType type;

    private String id;

    private long userTime;

    private long kernelTime;

    private int pid;

    private int tid;

    private String comm;

    private String host;

    private JsonObject extraData;

    public Event(FalconEvent event) {
        this(EventType.getEventType(event.type()));
        this.setId(event.id());
        this.setUserTime(event.userTime());
        this.setKernelTime(event.kernelTime());
        this.setPid((int) event.pid());
        this.setTid((int) event.tid());
        this.setComm(event.comm());
        this.setHost(event.host());
        this.parseExtraData(event.extraData());
    }

    Event(EventType type) {
        this.type = type;
        this.setExtraData(new JsonObject());
    }

    public EventType getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getUserTime() {
        return userTime;
    }

    public void setUserTime(long userTime) {
        this.userTime = userTime;
    }

    public long getKernelTime() {
        return kernelTime;
    }

    public void setKernelTime(long kernelTime) {
        this.kernelTime = kernelTime;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getComm() {
        return comm;
    }

    public void setComm(String comm) {
        this.comm = comm;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public JsonObject getExtraData() {
        return this.extraData;
    }

    public void setExtraData(JsonObject jsonObject) {
        if (jsonObject == null) {
            jsonObject = new JsonObject();
        }

        for (Map.Entry<String, JsonElement> keyValue : jsonObject.entrySet()) {
            if (!keyValue.getValue().isJsonPrimitive()) {
                throw new IllegalArgumentException("Invalid extra_data field: Only JSON primitives are allowed.");
            }
        }

        this.extraData = jsonObject;
    }

    private void parseExtraData(String jsonString) {
        JsonParser parser = new JsonParser();
        JsonObject parsedExtraData = new JsonObject();

        try {
            if (jsonString != null) {
                parsedExtraData = parser.parse(jsonString).getAsJsonObject();
            }
        } catch (IllegalStateException | IllegalArgumentException e) {
            throw new IllegalArgumentException("Invalid extra_data field: " + e.getMessage());
        }

        this.setExtraData(parsedExtraData);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return id.equals(event.id);
    }
}
