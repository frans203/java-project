import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List< EdgeAdj > edges =  Arrays.asList(new EdgeAdj(0, 1, 6), new EdgeAdj(1, 2, 7),
                new EdgeAdj(2, 0, 5), new EdgeAdj(2, 1, 4),
                new EdgeAdj(3, 2, 10), new EdgeAdj(4, 5, 1),
                new EdgeAdj(5, 4, 3));

        GraphAdjacency graph = new GraphAdjacency(edges);

        // print adjacency list representation of the graph
        graph.printGraph(graph);
    }
}