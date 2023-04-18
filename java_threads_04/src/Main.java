import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> buffer =
                new ArrayBlockingQueue<>(6);
        ExecutorService executorService =
                Executors.newFixedThreadPool(5);
        MyProducer producer = new MyProducer(buffer,
                ThreadColor.ANSI_YELLOW);
        MyConsumer consumer1 = new MyConsumer(buffer,
                ThreadColor.ANSI_PURPLE);
        MyConsumer consumer2 = new MyConsumer(buffer,
                ThreadColor.ANSI_CYAN);

        // we will need to sync something, maybe the arrayList, to
        // prevent certain threads to execute before one specific
        // thread
        executorService.execute(producer);
        executorService.execute(consumer1);
        executorService.execute(consumer2); //you'll need to
        // execute the threads manually
        Future<String> future =
                executorService.submit(new Callable<String>() {
                    @Override
                    public String call() throws Exception {
                        System.out.println(ThreadColor.ANSI_WHITE  + "I'm being printed for the Callable Class");
                        return "This is the callable result";
                    }
                });

        try{
            System.out.println(future.get());
        }catch(ExecutionException e){
            System.out.println("Something went wrong");
        }catch (InterruptedException e){
            System.out.println("Thread running the task was " +
                    "interrupted");
        }
        executorService.shutdown();
    }

}

class MyProducer implements Runnable{
        private ArrayBlockingQueue<String> buffer;
        private String color;

    public MyProducer(ArrayBlockingQueue<String> buffer, String color
                      ) {
        this.buffer = buffer;
        this.color = color;
    }

    public void run() {
        Random random = new Random();
        String[] nums = {"1", "2", "3", "4", "5"};

        for(String num : nums){
            try{
                System.out.println(color + "Adding..." + num);
                //each element adding will be sync, a thread can
                // only execute before that if that single element
                // at that moment is added
//                synchronized (buffer){
//                    buffer.add(num);
//                }
//                The way described below uses manually lock and
//                unlock method to do the actions whe need on the
//                bufferLock
//                bufferLock.lock();
//                buffer.add(num);
//                bufferLock.unlock();
//
//                The another way below uses the try...finally code
//                block
//                bufferLock.lock();
                //the buffer lock was removed to use the
                // ArrayBlockingQueue data type along with the
                // thread pools
//                try{
//                    buffer.add(num);
//                } finally {
//                    bufferLock.unlock(); //Guarantees that no
//                    // matter what happens in the try block the
//                    // bufferLock will unlock
//                }


                buffer.add(num);
                Thread.sleep(random.nextInt(1000));
            }catch (InterruptedException e){
                System.out.println("Producer was interrupted");
            }
        }
        System.out.println(color + "Adding EOF and exiting...");
        //The other thread cannot execute until the EOF is added
//        synchronized (buffer){
//            buffer.add("EOF"); //End of File
//        }
//        The way below uses lock unlock without try finally
//        bufferLock.lock();
//        buffer.add("EOF"); //End of File
//        bufferLock.unlock();
//        Using the try finally block
//        bufferLock.lock(); //removed for adding the new
//        ArrayBlockingQueue data type along with the
//                // thread pools
        try{
            buffer.put("EOF"); //End of File
        } catch (InterruptedException e){

        }

    }
}

class MyConsumer implements Runnable {
    private ArrayBlockingQueue<String> buffer;
    private String color;

    public MyConsumer(ArrayBlockingQueue<String> buffer, String color) {
        this.buffer = buffer;
        this.color = color;
    }

    public void run() {

        //Once one element is added, the sync block inside the
        // loop of the myProducer function is ended for that
        // time and this thread of the myConsumer can execute.
        // I've added all the code to the sync block because I
        // want to verify and remove at the same time and
        // prevent any threads to execute between that time.
        //This also prevents outOfBounds exceptions
//            synchronized (buffer){
//        while(true){
//                if(buffer.isEmpty()){
//                    continue;
//                }
//                if(buffer.get(0).equals("EOF")){
//                    System.out.println(color + "Exiting");
//                    break;
//                }else{
//                    System.out.println(color + " Removed " + buffer.remove(0));
//                }
//            }
//    }
    int counter = 0;
    while(true){
            synchronized (buffer){
                try{
                    if(buffer.isEmpty()){
                        continue;
                    }
                    if(buffer.peek().equals("EOF")){
                        System.out.println(color + "Exiting");
                        break;
                    }else{
                        System.out.println(color + "Removed " + buffer.take());
                    }
                }catch(InterruptedException e){
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}

