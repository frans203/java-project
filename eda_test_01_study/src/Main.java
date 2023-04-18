public class Main {
    public static void main(String[] args) {
        DoublyLinkedList linkedList = new DoublyLinkedList();

        linkedList.addToFront(10);
        linkedList.addToFront(20);
        linkedList.addToFront(312);

//        linkedList.insertElement(2, 99);
//
//        linkedList.addToTail(31);
//
//        linkedList.removeFromTail();
//        linkedList.removeElement(1);
        linkedList.printList();

//        System.out.println(linkedList.getPositionByElement(10));
//        System.out.println(linkedList.getElementByPosition(2));

    }
}