import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class Tutor {
    private Student student;
    private ReentrantLock lock = new ReentrantLock();

    public  void setStudent(Student student) {
        this.student = student;
    }

    public synchronized void studyTime() {
        try{
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                try{
                    System.out.println("Tutor has arrived");
                    try {
                        // wait for student to arrive and hand in assignment
                        Thread.sleep(300);
                    }
                    catch (InterruptedException e) {

                    }
                    student.startStudy();
                    System.out.println("Tutor is studying with student");
                }finally {
                    lock.unlock();
                }

            }
        }catch (InterruptedException e){

        }

    }

    public  void getProgressReport() {
        // get progress report
        System.out.println("Tutor gave progress report");
    }
}