public class Main {
    public static void main(String[] args) {
        //if you are using two different countdown objects,
        //the CountdownThreads will no longer share the same
        // countdown object, so it won't have interference
        Countdown countdown = new Countdown();
        CountdownThread t1 = new CountdownThread(countdown);
        t1.setName("Thread 1");
        CountdownThread t2 = new CountdownThread(countdown);
        t2.setName("Thread 2");

        t1.start();
        t2.start();

        //we can't garantee the order, or predict when each thread
        // will run and then it will be suspended
    }
}

class Countdown {
    //using a private int here it will "consume" certain numbers
    //It can, for example, duplicate the first result, but for the
    // rest it will have only one result for each number of the loop.
    //jvm aloccates an space the that local variable and the 2
    // instances of the Countdown object will use the same variable.
    // when thread one executes and changes value, and then gets
    // suspended so thread 2 can execute

    private int i;
    //if you are using the sync keyword, it will prevent the
    //interference and numbers don't show.
    //You can't sync constructors, because the instance will only
    // have the constructor once this one has finished, other
    // threads until that moment won't have access to id
    public void doCountdown() {
        String color;

        switch (Thread.currentThread().getName()){
            case "Thread 1":
                color = ThreadColor.ANSI_CYAN;
                break;
            case "Thread 2":
                color = ThreadColor.ANSI_PURPLE;
            default:
                color = ThreadColor.ANSI_GREEN;
        }
        //when it reachs here, a thread could be suspended just before
        // decrementing i, just before the condition, or just before
        // printing out. So it will skip numbers because the interference
        // of the thread on each other.
        //this situation is refered as a RACE CONDITION, when two
        // or more threads share the same resource

        //if you use the sync block to sync the color string
        // variable, the race condition will continue because of
        // the local variable of the class. To fix it you'll ned to
        // use the sync block with the this keyword to referece the
        // object.

        //remember that you'll only sync the code that NEEDS to be
        // sync
        synchronized (this){
            for(i=10;i>0;i--){
                System.out.println(color + Thread.currentThread().getName() + ": i =" + i);
            }
        }


        //this way there's no way to predict when or where a number
        // will be printed or what number will be printed
    }
}

class CountdownThread extends Thread {
    private Countdown threadCountdown;

    public CountdownThread(Countdown countdown){
        threadCountdown = countdown;
    }
    public void run() {
        threadCountdown.doCountdown();
    }

}
