import java.util.*;

public class DFS {
    private int V; // Number of vertices
    private List<List<Integer>> adj; // Adjacency list representation of the graph

    public DFS(int V) {
        this.V = V;
        adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v) {
        adj.get(u).add(v);
        //adj.get(v).add(u); // For an undirected graph
    }

    public void dfs(int startVertex) {
        boolean[] visited = new boolean[V];
        dfsUtil(startVertex, visited);
    }

    private void dfsUtil(int vertex, boolean[] visited) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        for (int neighbor : adj.get(vertex)) {
            if (!visited[neighbor]) {
                dfsUtil(neighbor, visited);
            }
        }
    }

    public static void main(String[] args) {
        int V = 7; // Number of vertices in the graph
        DFS graph = new DFS(V);
        Scanner sc = new Scanner(System.in);
        // Adding edges to the graph
        System.out.println("Enter the no of Edges");
        int e = sc.nextInt();
        for(int i=0;i<e;i++)
        {
            graph.addEdge(sc.nextInt(), sc.nextInt());

        }

        System.out.println("Depth-First Traversal (starting from vertex 0):");
        graph.dfs(0);
    }
}
