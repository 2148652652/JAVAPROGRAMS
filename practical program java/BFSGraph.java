import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;

class BFSGraph {
    private int V;
    private LinkedList<Integer>[] adj; // Use generic LinkedList

    @SuppressWarnings("unchecked") // Suppress unchecked conversion warning
    BFSGraph(int v) {
        V = v;
        adj = (LinkedList<Integer>[]) new LinkedList[v]; // Create and cast the array
        for (int i = 0; i < v; i++)
            adj[i] = new LinkedList<>();
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    void BFS(int n) {
        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();

        visited[n] = true;
        queue.add(n);

        while (!queue.isEmpty()) {
            n = queue.poll();
            System.out.print(n + " ");

            Iterator<Integer> iterator = adj[n].listIterator();
            while (iterator.hasNext()) {
                int neighbor = iterator.next();
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void main(String args[]) {
        BFSGraph graph = new BFSGraph(6);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 4);
        graph.addEdge(3, 5);
        graph.addEdge(4, 5);

        System.out.println("The Breadth First Traversal of the graph is as follows:");
        graph.BFS(0);
    }
}
