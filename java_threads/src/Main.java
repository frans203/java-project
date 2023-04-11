public class Main {
    public static void main(String[] args) {
        System.out.println(ThreadColor.ANSI_PURPLE + "Hello from " +
                "the" +
                " main " +
                "thread");
        Thread anotherThread = new AnotherThread();
        anotherThread.setName("== Another Thread ==");
        anotherThread.start();
       new Thread() {
            public void run() {
                System.out.println(ThreadColor.ANSI_GREEN + "hello " +
                        "from anon " +
                        "class thread");
            }
        }.start();

        Thread myRunnableThread = new Thread(new MyRunnable(){
            @Override
            public void run() {
                System.out.println(ThreadColor.ANSI_RED + "Hello " +
                        "from " +
                        "another " +
                        "anon class implementation of run()");

                try{
                    anotherThread.join(); //the following code will
                    // only run after the anotherThread is finished
                    System.out.println(ThreadColor.ANSI_RED +
                            "Another Thread terminated, so I'm " +
                            "running again");
                }catch(InterruptedException e){
                    //if you passed a value inside the join and
                    // after that time the thread isn't finished,
                    // it will throw an exception which you'll get
                    // here
                    System.out.println(ThreadColor.ANSI_RED + "I " +
                            "was interrupted");
                }
            }
        });
        //creating a thread based at my runnable thread
        myRunnableThread.start();
//        anotherThread.interrupt();
        System.out.println(ThreadColor.ANSI_PURPLE + "Hello again " +
                "from the " +
                "main" +
                " thread");

    }
}