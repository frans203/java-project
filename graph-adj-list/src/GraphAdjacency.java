import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.List;

public class GraphAdjacency {
    List <List<NodeAdj>> adj = new ArrayList<>();
    public GraphAdjacency(List < EdgeAdj > edges){
        for(int i=0;i<edges.size();i++){
            adj.add(i, new ArrayList<>());
        }

        for (EdgeAdj edge: edges){
            adj.get(edge.src).add(new NodeAdj(edge.dest, edge.weight));
        }
    }

    public static void printGraph(GraphAdjacency graph){
        int src = 0;
        int n = graph.adj.size();

        while(src < n){
            for(NodeAdj edge: graph.adj.get(src)){
                System.out.print(src + " --> " + edge.value +
                        " (" + edge.weight + ")\t");
            }

            System.out.println();
            src++;
        }
    }
}
