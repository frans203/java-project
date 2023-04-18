import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class Student {

    private Tutor tutor;
    private ReentrantLock lock = new ReentrantLock();

    Student(Tutor tutor) {
        this.tutor = tutor;
    }

    public  void startStudy() {
        // study
        System.out.println("Student is studying");
    }

    public synchronized void handInAssignment() {
        try{
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                try{
                    tutor.getProgressReport();
                    System.out.println("Student handed in assignment");
                }finally {
                    lock.unlock();
                }
            }
        }catch (InterruptedException e){

        }
    }
}