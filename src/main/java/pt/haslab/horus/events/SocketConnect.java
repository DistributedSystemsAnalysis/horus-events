package pt.haslab.horus.events;

import pt.haslab.horus.events.flatbuffers.generated.FalconEvent;

public class SocketConnect
        extends SocketEvent {
    public SocketConnect() {
        super(EventType.CONNECT);
    }

    public SocketConnect(FalconEvent event) {
        super(event);
    }
}
