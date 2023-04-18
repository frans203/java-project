package stack_queue;

import java.sql.Array;
import java.util.*;

public class StackQueue {
    public static void main(String[] args) {
       Queue<Integer> q = new LinkedList<>();
       Stack<Integer> s1 = new Stack<Integer>();
       Stack<Integer> s2 = new Stack<Integer>();

       s1.push(3);
       s1.push(2);
       s1.push(1);

       while(!s1.empty()){
           s2.push(s1.pop());
           if(!s1.isEmpty()){
               s2.push(s1.peek());

           }
           q.offer(s2.peek());
       }

       s1.push(q.remove());

       String output = "";

       while(s1.size() > 0){
           output = s1.pop() + " " + output;
       }
        System.out.println("S1: " + output + "(top)");
    }
}
