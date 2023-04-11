import list.Employee;
import list.ListStudy;
import queues.ArrayQueue;

import java.time.temporal.Temporal;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
//        Employee janeJones = new Employee("Jane", "Jones", 123);
//        Employee johnDoe = new Employee("david", "cobblepot", 123);
//        Employee bruceWayne = new Employee("Bruce", "Wayne", 1231);
//
//        ArrayQueue queue = new ArrayQueue(10);
//        queue.add(janeJones);
//        queue.add(johnDoe);
//        queue.add(bruceWayne);
//        queue.remove();
//        System.out.println("peek: " + queue.peek());
//        queue.printQueue();
//        System.out.println(checkForPalindromeStackQueue("abccba"));
//        System.out.println(checkForPalindromeStackQueue("boi"));
        List<Integer> arrayList = new Vector<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        Stack<Integer> stack = new Stack<>();
        List<Integer> arrayInverted = new Vector<>();
        System.out.println(arrayList.toString());

        for(int i = 0;i<arrayList.toArray().length;i++){
            stack.push(arrayList.get(i));
        }

        for (int i = 0; i<arrayList.toArray().length;i++){
            arrayInverted.add(stack.pop());
        }

        System.out.println(arrayInverted.toString());

    }

    public static boolean checkForPalindrome(String string) {
        LinkedList<Character> stack = new LinkedList<Character>();
        StringBuilder stringNoPunctuation =
                new StringBuilder(string.length());
        String lowerCase = string.toLowerCase();
        for(int i=0;i<lowerCase.length();i++){
            char c = lowerCase.charAt(i);
            if(c >= 'a' && c <= 'z'){
                stringNoPunctuation.append(c);
                stack.push(c);
            }
        }

        StringBuilder reversedString =
                new StringBuilder(stack.size());
        while(!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }
        System.out.println(reversedString);
        
        return reversedString.toString().equals(stringNoPunctuation.toString());
    }

    public static boolean checkForPalindromeStackQueue(String string){
        LinkedList<Character> stack = new LinkedList<Character>();
        LinkedList<Character> queue = new LinkedList<Character>();
        String lowerCase = string.toLowerCase();

        for(int i=0;i<lowerCase.length();i++){
            if(lowerCase.charAt(i) >= 'a' && lowerCase.charAt(i) <= 'z' ){
                queue.addLast(lowerCase.charAt(i));
                stack.push(lowerCase.charAt(i));
            }
        }


        while(!stack.isEmpty()){
            if(!stack.pop().equals(queue.removeFirst())){
                return false;
            }
        }

        return true;
    }
}