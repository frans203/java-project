public class DoublyNode {
    private int content;
    private DoublyNode next;
    private DoublyNode prev;

    public DoublyNode(int content) {
        this.content = content;
        next = null;
        prev = null;
    }

    public int getContent() {
        return content;
    }

    public void setContent(int content) {
        this.content = content;
    }

    public DoublyNode getNext() {
        return next;
    }

    public void setNext(DoublyNode next) {
        this.next = next;
    }

    public DoublyNode getPrev() {
        return prev;
    }

    public void setPrev(DoublyNode prev) {
        this.prev = prev;
    }

    @Override
    public String toString() {
        return "DoublyNode{" +
                "content=" + content +

                '}';
    }
}
