public class Lock2Bools extends Thread{
    Lock2BoolsInterface lock;
    int id;

    public Lock2Bools(Lock2BoolsInterface lock, int id){
        this.lock = lock;
        this.id = id;
    }

    @Override
    public void run() {
        lock.requestCS(id);

        lock.releaseCS(id);
    }
}
