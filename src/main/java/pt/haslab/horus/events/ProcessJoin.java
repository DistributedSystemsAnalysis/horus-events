package pt.haslab.horus.events;

import pt.haslab.horus.events.flatbuffers.generated.FalconEvent;

public class ProcessJoin
        extends Event {
    private int childPid;

    public ProcessJoin() {
        super(EventType.JOIN);
    }

    public ProcessJoin(FalconEvent event) {
        super(event);

        pt.haslab.horus.events.flatbuffers.generated.ProcessJoin concreteEvent =
                (pt.haslab.horus.events.flatbuffers.generated.ProcessJoin) event.event(
                        new pt.haslab.horus.events.flatbuffers.generated.ProcessJoin());

        this.setChildPid((int) concreteEvent.childPid());
    }

    public int getChildPid() {
        return childPid;
    }

    public void setChildPid(int childPid) {
        this.childPid = childPid;
    }
}
