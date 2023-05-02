
public class LockBoolInterfaceImpl implements LockBoolInterface {
    boolean busy = false;
    public void requestCS() {
        while(busy);
        busy=true;
    }
    public void releaseCS() {
        busy = false;
    }
}
