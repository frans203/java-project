package priorityQueue;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorQueue {
    public static void main(String[] args) {
        Queue<String> queue =
                new PriorityQueue<>();
        queue.offer("B");
        queue.offer("C");
        queue.offer("A");
        queue.offer("F");
        queue.offer("E");

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
