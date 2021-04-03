package pt.haslab.horus.events;

import pt.haslab.horus.events.flatbuffers.generated.FalconEvent;

public class ProcessCreate
        extends Event {
    private int childPid;

    public ProcessCreate() {
        super(EventType.CREATE);
    }

    public ProcessCreate(FalconEvent event) {
        super(event);

        pt.haslab.horus.events.flatbuffers.generated.ProcessCreate concreteEvent =
                (pt.haslab.horus.events.flatbuffers.generated.ProcessCreate) event.event(
                        new pt.haslab.horus.events.flatbuffers.generated.ProcessCreate());

        this.setChildPid((int) concreteEvent.childPid());
    }

    public int getChildPid() {
        return childPid;
    }

    public void setChildPid(int childPid) {
        this.childPid = childPid;
    }
}
