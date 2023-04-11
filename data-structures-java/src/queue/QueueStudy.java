package queue;

import java.util.*;

public class QueueStudy {
    public static void main(String[] args) {
        Queue<String> queue01  = new LinkedList<String>();

        System.out.println(queue01.isEmpty());
        queue01.offer("Karen");
        queue01.offer("Chad");
        queue01.offer("Steve");
        queue01.offer("Harold");
        System.out.println(queue01.isEmpty());
        System.out.println(queue01.size());
        System.out.println(queue01.contains("Chad"));

        System.out.println(queue01.peek());
        queue01.poll();
        System.out.println(queue01.peek());
        System.out.println(queue01);

    }

}
