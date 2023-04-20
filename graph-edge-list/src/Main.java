public class Main {
    public static void main(String[] args) {
        Graph ourGraph = new Graph();

        // nodes
        Node v0 = new Node("0");
        Node v1 = new Node("1");
        Node v2 = new Node("2");
        Node v3 = new Node("3");

        ourGraph.addVertex(v0);
        ourGraph.addVertex(v1);
        ourGraph.addVertex(v2);
        ourGraph.addVertex(v3);

        ourGraph.addEdge(v0, v1, 2);
        ourGraph.addEdge(v1, v2, 3);
        ourGraph.addEdge(v2, v0, 1);
        ourGraph.addEdge(v2, v3, 1);
        ourGraph.addEdge(v3, v2, 4);

        ourGraph.printGraph();


    }


}