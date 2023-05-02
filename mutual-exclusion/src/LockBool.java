public class LockBool extends Thread{
    private LockBoolInterface lockBoolInterface;

    public LockBool(LockBoolInterface lockBoolInterface){
        this.lockBoolInterface = lockBoolInterface;
    }
    @Override
    public void run() {
        while(true){
            lockBoolInterface.requestCS();
            //critical
            lockBoolInterface.releaseCS();
        }
    }
}
