import java.util.LinkedList;

public class Node {
    private String name;
    private LinkedList<Edge> edgeList;

    public Node(String name) {
        this.name = name;
        this.edgeList = new LinkedList<>();
    }

    public String getName() {
        return name;
    }

    public LinkedList<Edge> getEdges() {
        return edgeList;
    }
}
