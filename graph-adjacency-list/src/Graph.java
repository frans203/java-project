import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

public class Graph {
    private boolean adjMatrix[][];
    private int numVertices;

    public Graph(int numVertices){
        this.numVertices = numVertices;
        this.adjMatrix = new boolean[numVertices][numVertices];
    }

    public void addEdge(int i, int j){
        adjMatrix[i][j] = true;
        adjMatrix[j][i] = true;
    }

    public void removeEdge(int i, int j){
        adjMatrix[i][j] = false;
        adjMatrix[j][i] = false;
    }

    public void bfs(int start, int end) {
        boolean[] visited = new boolean[adjMatrix.length];
        Queue<Integer> queue = new ArrayDeque<>();

        visited[start] = true;
        queue.offer(start);
        System.out.println("Path from " + start + " to " + end + ": ");
        while(!queue.isEmpty()) {

            int current = queue.poll();

            System.out.print(current + " ");
            if(current == end){
                return;
            }
            for(int i = 0;i<adjMatrix.length;i++){
                if(adjMatrix[current][i] && !visited[i]){
                    visited[i] = true;
                    queue.offer(i);
                }
            }

        }

        for(int i = 0; i<visited.length;i++){
            if(!visited[i]){
                System.out.println("\nThere's no path between: " + start + " " + end);
                return;
            }
        }

    }

    public void dfs(int start){
        boolean[] visited = new boolean[adjMatrix.length];
        Stack<Integer> stack = new Stack<>();

        visited[start] = true;
        stack.push(start);

        System.out.println(Arrays.toString(visited));

        while(!stack.isEmpty()){
            int current  = stack.pop();
            System.out.print(current + " ");

            for(int i=0;i<adjMatrix.length;i++){
                if(adjMatrix[current][i] && !visited[i]){
                    visited[i] = true;
                    stack.push(i);
                }
            }

        }


    }



    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < numVertices; i++) {
            s.append(i + ": ");
            for (boolean j: adjMatrix[i]) {
                s.append((j ? 1 : 0) + " ");
            }
            s.append("\n");
        }
        return s.toString();
    }
}
