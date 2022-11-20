package be.pxl.rct.rollercoaster;

import be.pxl.rct.visitor.Visitor;

public class RollerCoaster implements QueueArea<Visitor> {

    private String name;

    @Override
    public int getAllowed() {
        return 0;
    }

    @Override
    public int getTime() {
        return 0;
    }

    @Override
    public void enter(Visitor visitor) {

    }
}
