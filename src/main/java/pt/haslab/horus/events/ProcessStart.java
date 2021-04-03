package pt.haslab.horus.events;

import pt.haslab.horus.events.flatbuffers.generated.FalconEvent;

public class ProcessStart
        extends Event {
    public ProcessStart() {
        super(EventType.START);
    }

    public ProcessStart(FalconEvent event) {
        super(event);
    }
}
