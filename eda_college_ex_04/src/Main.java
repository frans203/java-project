public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(3);

        queue.add(10);
        queue.add(321);
        queue.add(111);
        System.out.println(queue.methodSize());

        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());

        queue.remove();

        System.out.println("peek: " + queue.peek());
        queue.printQueue();
    }
}