package pt.haslab.horus.events;

import pt.haslab.horus.events.flatbuffers.generated.FalconEvent;

public class SocketSend
        extends SocketEvent {
    private int size;

    public SocketSend() {
        super(EventType.SND);
    }

    public SocketSend(FalconEvent event) {
        super(event);

        pt.haslab.horus.events.flatbuffers.generated.SocketEvent concreteSocketEvent =
                (pt.haslab.horus.events.flatbuffers.generated.SocketEvent) event.event(
                        new pt.haslab.horus.events.flatbuffers.generated.SocketEvent());

        pt.haslab.horus.events.flatbuffers.generated.SocketSend concreteEvent =
                (pt.haslab.horus.events.flatbuffers.generated.SocketSend) concreteSocketEvent.event(
                        new pt.haslab.horus.events.flatbuffers.generated.SocketSend());

        this.setSize((int) concreteEvent.size());
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
