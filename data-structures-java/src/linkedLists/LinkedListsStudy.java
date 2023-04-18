package linkedLists;

import java.util.LinkedList;

public class LinkedListsStudy {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
//        linkedList.push("A");
//        linkedList.push("B");
//        linkedList.push("C");
//        linkedList.push("D");
//        linkedList.push("F");
//        linkedList.pop();
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
//        linkedList.poll();
        linkedList.add(4, "E");
        System.out.println(linkedList);

        linkedList.remove("E");
        System.out.println(linkedList.indexOf("F"));
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        linkedList.addFirst("0");
        linkedList.addLast("02");
        System.out.println(linkedList);
        String first = linkedList.removeFirst();
        String last = linkedList.removeLast();
        System.out.println(first + " " + last);
        System.out.println(linkedList);

    }
}
