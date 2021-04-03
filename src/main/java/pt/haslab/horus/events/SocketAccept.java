package pt.haslab.horus.events;

import pt.haslab.horus.events.flatbuffers.generated.FalconEvent;

public class SocketAccept
        extends SocketEvent {
    public SocketAccept() {
        super(EventType.ACCEPT);
    }

    public SocketAccept(FalconEvent event) {
        super(event);
    }
}
