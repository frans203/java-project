public class LinkedList {
    private Node head;
    private int size;

    public boolean addToFront(int content){
        Node newNode = new Node(content);
        newNode.setNext(head);
        head = newNode;
        size++;
        return true;
    }

    public boolean addToTail(int content){
        Node current = head;
        Node newElement = new Node(content);
        if(isEmpty()){
            return false;
        }
        while(current != null){
            if(current.getNext() == null){
                current.setNext(newElement);
                size++;

                return true;
            }
            current = current.getNext();
        }
        return true;
    }

    public boolean removeFromTail(){
        if(isEmpty()){
            return false;
        }
        Node current = head;
        Node tail;
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

    public Node removeFromFront(){
        if(isEmpty()){
            return null;
        }
        Node removedHead = head;
        head = head.getNext();
        removedHead.setNext(null);
        size--;
        return head;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public Node getHead() {
        return head;
    }

    public int getSize() {
        return size;
    }

    public Node getElementByPosition(int position) {
        Node current = head;
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
        Node current = head;
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
        Node current = head;
        System.out.println("HEAD: ");
        while(current != null){
            System.out.println(current);
            System.out.println(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

    public void insertElement(int position, int content){
        Node newElement = new Node(content);
        Node current = head;
        Node nextElement;
        int currentPosition = 1;
        if(position == 1){
            addToFront(content);
            return;
        }

        while(current != null){
            if(currentPosition == position){
                nextElement = current.getNext();
                current.setNext(newElement);
                newElement.setNext(nextElement);
                size++;
            }
            currentPosition++;
            current = current.getNext();
        }
    }

    public void modifyElement(int position, int content){
        Node current = head;
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
            Node current = head;
            Node previousElement = null;
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
