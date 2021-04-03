package pt.haslab.horus.events;

import pt.haslab.horus.events.flatbuffers.generated.FalconEvent;

public class FSync
        extends Event {

    public FSync() {
        super(EventType.FSYNC);
    }

    public FSync(FalconEvent event) {
        super(event);
    }
}
