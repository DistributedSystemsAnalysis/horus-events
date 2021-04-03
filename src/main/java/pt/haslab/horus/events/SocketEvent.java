package pt.haslab.horus.events;

import pt.haslab.horus.events.flatbuffers.generated.EventData;
import pt.haslab.horus.events.flatbuffers.generated.FalconEvent;

public abstract class SocketEvent
        extends Event {
    private int sourcePort;

    private int destinationPort;

    private int socketFamily;

    private String socketFrom;

    private String socketTo;

    private String socketId;

    public SocketEvent(FalconEvent event) {
        super(event);

        if (event.eventType() != EventData.SocketEvent) {
            throw new IllegalArgumentException(
                    "Mismatching type of event [" + event.eventType() + "]. Concrete event type is ["
                            + event.type() + "]");
        }
        pt.haslab.horus.events.flatbuffers.generated.SocketEvent concreteEvent =
                (pt.haslab.horus.events.flatbuffers.generated.SocketEvent) event.event(
                        new pt.haslab.horus.events.flatbuffers.generated.SocketEvent());

        this.setSourcePort(concreteEvent.sourcePort());
        this.setDestinationPort(concreteEvent.destinationPort());
        this.setSocketFamily(concreteEvent.socketFamily());
        this.setSocketFrom(concreteEvent.socketFrom());
        this.setSocketTo(concreteEvent.socketTo());
        this.setSocketId(concreteEvent.socketId());
    }

    protected SocketEvent(EventType type) {
        super(type);
    }

    public int getSourcePort() {
        return sourcePort;
    }

    public void setSourcePort(int sourcePort) {
        this.sourcePort = sourcePort;
    }

    public int getDestinationPort() {
        return destinationPort;
    }

    public void setDestinationPort(int destinationPort) {
        this.destinationPort = destinationPort;
    }

    public int getSocketFamily() {
        return socketFamily;
    }

    public void setSocketFamily(int socketFamily) {
        this.socketFamily = socketFamily;
    }

    public String getSocketFrom() {
        return socketFrom;
    }

    public void setSocketFrom(String socketFrom) {
        this.socketFrom = socketFrom;
    }

    public String getSocketTo() {
        return socketTo;
    }

    public void setSocketTo(String socketTo) {
        this.socketTo = socketTo;
    }

    public String getSocketId() {
        return socketId;
    }

    public void setSocketId(String socketId) {
        this.socketId = socketId;
    }
}
