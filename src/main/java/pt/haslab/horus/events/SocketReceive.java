package pt.haslab.horus.events;

import pt.haslab.horus.events.flatbuffers.generated.FalconEvent;

public class SocketReceive
        extends SocketEvent {
    private int size;

    public SocketReceive() {
        super(EventType.RCV);
    }

    public SocketReceive(FalconEvent event) {
        super(event);

        pt.haslab.horus.events.flatbuffers.generated.SocketEvent concreteSocketEvent =
                (pt.haslab.horus.events.flatbuffers.generated.SocketEvent) event.event(
                        new pt.haslab.horus.events.flatbuffers.generated.SocketEvent());

        pt.haslab.horus.events.flatbuffers.generated.SocketReceive concreteEvent =
                (pt.haslab.horus.events.flatbuffers.generated.SocketReceive) concreteSocketEvent.event(
                        new pt.haslab.horus.events.flatbuffers.generated.SocketReceive());

        this.setSize((int) concreteEvent.size());
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
