public class Node {
    private int content;
    private Node next;

    public Node(int content){
        this.content = content;
    }

    public void setContent(int content) {
        this.content = content;
    }

    public int getContent() {
        return content;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "content=" + content +
                ", next=" + next +
                '}';
    }
}
