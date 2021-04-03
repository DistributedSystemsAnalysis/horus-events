package pt.haslab.horus.events;

import pt.haslab.horus.events.flatbuffers.generated.FalconEvent;

public class Log
        extends Event {

    public Log() {
        super(EventType.LOG);
    }

    public Log(FalconEvent event) {
        super(event);
    }
}
