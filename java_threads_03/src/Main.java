import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Message message = new Message();
        (new Thread(new Writer(message))).start();
        (new Thread(new Reader(message))).start();
        //if two threads starts at a time, and the two method os
        // read and write uses the sync code, the empty property is
        // not updated3q5
    }
}

class Message{
    private String message;
    private boolean empty = true;

    public synchronized String read() {
        while(empty){
            try{
                wait();
            }catch(InterruptedException e){

            }
        }

        empty = true;
        notifyAll();
        return message;
    }

    public synchronized void write(String message){
        while(!empty){
            try{
                wait();
            }catch(InterruptedException e){

            }
        }
        empty=false;
        notifyAll();
        this.message = message;
    }
}

class Writer implements Runnable {
    private Message message;

    public Writer(Message message){
        this.message = message;
    }

    public void run() {
        String[] messages = {
                "Message number 01",
                "Message number 02",
                "Message number 03",
                "Message number 04"
        };

        Random random = new Random();
        for(int i=0;i<messages.length;i++){
            message.write(messages[i]);

            try{
                Thread.sleep(random.nextInt(2000));
            }catch (InterruptedException e){
                System.out.println("Error message: " + e);
            }
        }

        message.write("Finished");
    }
}

class Reader implements Runnable {
    private Message message;

    public Reader(Message message){
        this.message = message;
    }

    public void run() {
        Random random = new Random();
        for(String latestMessage = message.read(); !latestMessage.equals("Finished"); latestMessage = message.read()){
            System.out.println(latestMessage);
            try{
                Thread.sleep(random.nextInt(2000));
            }catch (InterruptedException e){
                System.out.println("error message: " + e);
            }
        }
    }
}