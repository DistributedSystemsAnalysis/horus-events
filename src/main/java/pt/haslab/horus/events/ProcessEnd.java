package pt.haslab.horus.events;

import pt.haslab.horus.events.flatbuffers.generated.FalconEvent;

public class ProcessEnd
        extends Event {
    public ProcessEnd() {
        super(EventType.END);
    }

    public ProcessEnd(FalconEvent event) {
        super(event);
    }
}
