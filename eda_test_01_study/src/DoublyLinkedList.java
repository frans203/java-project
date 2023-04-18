public class DoublyLinkedList {
    DoublyNode head;
    DoublyNode tail;
    private int size;

    public DoublyLinkedList(){
        size = 0;
        tail = null;
        head = null;
    }


    public boolean addToFront(int content){
        DoublyNode newNode = new DoublyNode(content);
        newNode.setNext(head);
        newNode.setPrev(null);
        if(isEmpty()){
            tail = newNode;
        }else{
            head.setPrev(newNode);
        }
        head = newNode;
        size++;
        return true;
    }

    public boolean addToTail(int content){
//       DoublyNode current = head;
       DoublyNode newElement = new DoublyNode(content);
        if(isEmpty()){
            return false;
        }
//        while(current != null){
//            if(current.getNext() == null){
//                current.setNext(newElement);
//                size++;
//
//                return true;
//            }
//            current = current.getNext();
//        }
//        return true;
        newElement.setPrev(tail);
        newElement.setNext(null);
        tail.setNext(newElement);
        return true;
    }

    public boolean removeFromTail(){
        if(isEmpty()){
            return false;
        }
       DoublyNode current = head;
       DoublyNode tail;
        int count = 1;
        while(current != null){
            if(current.getNext() == null){
                tail = current;
                break;
            }
            current = current.getNext();
            count++;
        }
        tail = getElementByPosition(count - 1);
        tail.setNext(null);
        size--;
        return true;
    }

    DoublyNode removeFromFront(){
        if(isEmpty()){
            return null;
        }
       DoublyNode removedHead = head;
        head = head.getNext();
        removedHead.setNext(null);
        size--;
        return head;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    DoublyNode getHead() {
        return head;
    }

    public int getSize() {
        return size;
    }

    DoublyNode getElementByPosition(int position) {
       DoublyNode current = head;
        int currentPosition = 1;
        while(current != null){
            if(currentPosition == position){
                return current;
            }
            current = current.getNext();
            currentPosition++;
        }



        return null;
    }

    public int getPositionByElement(int content){
       DoublyNode current = head;
        int position = 1;
        while(current != null){
            if(current.getContent() == content){
                return position;
            }
            position++;
            current=current.getNext();
        }

        return -1;
    }

    public void printList() {
       DoublyNode current = head;
        System.out.println("HEAD: ");
        while(current != null){
            System.out.println(current);
            System.out.println(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

    public void insertElement(int position, int content){
//       DoublyNode newElement = DoublyNode(content);
//       DoublyNode current = head;
//       DoublyNode nextElement;
//        int currentPosition = 1;
//        if(position == 1){
//            addToFront(content);
//            return;
//        }
//
//        while(current != null){
//            if(currentPosition == position){
//                nextElement = current.getNext();
//                current.setNext(newElement);
//                newElement.setNext(nextElement);
//                size++;
//            }
//            currentPosition++;
//            current = current.getNext();
//        }
    }

    public void modifyElement(int position, int content){
       DoublyNode current = head;
        int currentPosition = 1;
        while (current != null){
            if(currentPosition == position){
                current.setContent(content);
            }
            current = current.getNext();
            currentPosition++;
        }
    }

    public void removeElement(int position){
        if(position == 1){
            removeFromFront();
        }else if(position == size){
            removeFromTail();
        }else{
            if(isEmpty()){
                return;
            }
           DoublyNode current = head;
           DoublyNode previousElement = null;
            int currentPosition = 1 ;
            while (current != null){
                if(currentPosition == position){
                    assert false;
                    previousElement.setNext(current.getNext());
                    size--;
                }
                previousElement = current;
                current = current.getNext();
                currentPosition++;
            }
        }


    }
}
