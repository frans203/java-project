public class Queue {
    private int[] queue;
    private int front;
    private int back;
    private int capacity;

    public Queue (int size) {
        queue = new int[size];
        front = 0;
        back = 0;
        capacity = size;
    }

    public boolean isEmpty() {
        return front == 0 && back == 0;
    }

    public boolean isFull() {
        return back == capacity;
    }

    public boolean add(int element){
        if(isFull()){
            return false;
        }
        queue[back] = element;
        back++;
        return true;
    }

    public int remove(){
        if(isEmpty()){
            return -1;
        }

        int element = queue[front];
        queue[front] = queue[front+1];
        front++;
        return element;
    }

    public int methodSize() {
        return queue.length + 1;
    }

    public int peek() {
        if(size() == 0){
            return -1;
        }
        return queue[front];
    }

    public int size() {
        return back - front;
    }

    public void printQueue() {
        for(int i = front; i<back; i++){
            System.out.println(queue[i]);
        }
    }


}
