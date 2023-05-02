public class LockSelection extends Thread {
    LockSelectionInterface lock;
    int id;

    LockSelection(LockSelectionInterface lock, int id) {
        this.lock = lock;
        this.id = id;
    }


    public void run() {
        while(true){
            lock.requestCS(id);
            //critical
            lock.releaseCS(id);
        }
    }
}
