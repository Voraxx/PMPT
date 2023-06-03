package ranlib;
import java.util.*;

/**
 * <p><u><b>Class Name:</b></u></p>
 * <p>Dijkstra</p>
 *
 * <p><u><b>Description:</b></u></p>
 * <p>The Dijkstra class implements Dijkstra's algorithm for finding the shortest paths in a graph.
 * It takes an adjacency matrix representation of the graph and a source node as input and computes the shortest
 * distances from the source node to all other nodes in the graph.</p>
 *
 * <p><u><b>Instance Variables:</b></u></p>
 * <p><code>graph</code>: A 2D array representing the adjacency matrix of the graph. It stores the weights of the edges between nodes.</p>
 * <p><code>distances</code>: An array that stores the shortest distances from the source node to all other nodes in the graph.</p>
 *
 * <p><u><b>Constructor:</b></u></p>
 * <p><code>Dijkstra()</code>: Initializes the Dijkstra object by setting the graph and distances array to empty values.</p>
 *
 * <p><u><b>Methods:</b></u></p>
 * <p><code>dijkstra(int[][] graph, int source)</code>:</p> Computes the shortest distances from the source node to all other nodes in the graph.</p>
 * <p><code>minDistance(int[] distances, boolean[] visited)</code>:</p> Finds the index of the node with the minimum distance among the unvisited nodes.</p>
 *
 * <p><u><b>Main Method:</b></u></p>
 * <p><code>main(String[] args)</code>: The entry point of the program. It is used for testing the Dijkstra class.
 * It creates a graph, initializes a sample adjacency matrix, and invokes the <i>dijkstra()</i> method with the graph and source node as arguments.</p>
 *
 * <p>It's important to note that Dijkstra's algorithm is designed for graphs without negative edge weights, and it has a time complexity of O(log.e(V)),
 * where V is the number of nodes. There are more efficient algorithms, such as the A* algorithm, for finding shortest paths in large graphs.</p>
 *
 * <p><u><b>License:</b></u></p>
 * <p>Version 1.0</p>
 * <p>2023/06/03</p>
 * <p>Attribution: <a href="https://creativecommons.org/licenses/by/4.0/">CC BY</a></p>
 * <p>Adrian Morgenthal <a href="https://github.com/Voraxx">Github</a></p>
 */

public class Dijkstra {
    private static final int INFINITY = Integer.MAX_VALUE;

    /**
     * Computes the shortest paths from a source node to all other nodes in the graph.
     *
     * @param graph  The graph represented as an adjacency matrix.
     * @param source The source node index.
     */
    public static void dijkstra(int[][] graph, int source) {
        int numVertices = graph.length;
        int[] distances = new int[numVertices];
        boolean[] visited = new boolean[numVertices];

        // Initialize all distances with infinity and visited array with false
        Arrays.fill(distances, INFINITY);
        Arrays.fill(visited, false);

        // The source node has a distance of 0
        distances[source] = 0;

        // Repeat the algorithm for all nodes
        for (int i = 0; i < numVertices - 1; i++) {
            // Choose the node with the minimum distance as the current node
            int current = minDistance(distances, visited);
            visited[current] = true;

            // Update the distances to the neighboring nodes of the current node
            for (int j = 0; j < numVertices; j++) {
                if (!visited[j] && graph[current][j] != 0 && distances[current] != INFINITY
                        && distances[current] + graph[current][j] < distances[j]) {
                    distances[j] = distances[current] + graph[current][j];
                }
            }
        }

        // Print the shortest distances
        System.out.println("Knoten\t\tDistanz");
        for (int i = 0; i < numVertices; i++) {
            System.out.println(i + "\t\t" + distances[i]);
        }
    }

    /**
     * Finds the index of the node with the minimum distance among the unvisited nodes.
     *
     * @param distances The distances array.
     * @param visited   The visited array.
     * @return The index of the node with the minimum distance.
     */
    private static int minDistance(int[] distances, boolean[] visited) {
        int minDistance = INFINITY;
        int minIndex = -1;
        for (int i = 0; i < distances.length; i++) {
            if (!visited[i] && distances[i] < minDistance) {
                minDistance = distances[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    /**
     * The main method creates a graph and invokes the Dijkstra's algorithm.
     *
     * @param args The command-line arguments (unused).
     */
    public static void main(String[] args) {
        int[][] graph = {
                {0, 4, 0, 0, 0, 0, 0, 8, 0},
                {4, 0, 8, 0, 0, 0, 0, 11, 0},
                {0, 8, 0, 7, 0, 4, 0, 0, 2},
                {0, 0, 7, 0, 9, 14, 0, 0, 0},
                {0, 0, 0, 9, 0, 10, 0, 0, 0},
                {0, 0, 4, 14, 10, 0, 2, 0, 0},
                {0, 0, 0, 0, 0, 2, 0, 1, 6},
                {8, 11, 0, 0, 0, 0, 1, 0, 7},
                {0, 0, 2, 0, 0, 0, 6, 7, 0}
        };

        dijkstra(graph, 0);
    }
}
