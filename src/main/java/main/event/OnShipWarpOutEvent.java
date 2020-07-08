package main.event;

public class OnShipWarpOutEvent implements IEvent {
    //TODO fix this
    public final Object ship;
    public OnShipWarpOutEvent(Object shipIn) {
        this.ship = shipIn;
    }
    public void cancel() {}
    public void complete() {}

    @Override
    public boolean isCancellable() {
        return true;
    }
}
