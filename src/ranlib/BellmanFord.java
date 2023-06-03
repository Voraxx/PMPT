package ranlib;
import java.util.Arrays;

/**
 * <p><u><b>Class Name:</b></u></p>
 * <p>BellmanFord</p>
 *
 * <p><u><b>Description:</b></u></p>
 * <p>The BellmanFord class implements the Bellman-Ford algorithm to find the shortest path in a weighted graph.
 * It takes an adjacency matrix representation of the graph and a source vertex as input and computes the shortest
 * distances from the source vertex to all other vertices in the graph.</p>
 *
 * <p><u><b>Instance Variables:</b></u></p>
 * <p><code>graph</code>: A 2D array representing the adjacency matrix of the graph. It stores the weights of the edges between vertices.</p>
 * <p><code>distance</code>: An array that stores the shortest distances from the source vertex to all other vertices in the graph.</p>
 *
 * <p><u><b>Constructor:</b></u></p>
 * <p><code>BellmanFord()</code>: Initializes the BellmanFordAlgorithm object by setting the graph and distance array to empty values.</p>
 *
 * <p><u><b>Methods:</b></u></p>
 * <p><code>bellmanFord(int[][] graph, int source)</code>: Computes the shortest distances from the source vertex to all other vertices in the graph.</p>
 * <p><code>relaxEdge(int u, int v, int weight)</code>: Updates the distance[v] if a shorter path to vertex v is found through vertex u.</p>
 * <p><code>printShortestDistances(int source)</code>: Prints the shortest distances from the source vertex to all other vertices.</p>
 *
 * <u><b>Main Method:</b></u></p>
 * <p><code>main(String[] args)</code>: The entry point of the program. It is used for testing the BellmanFordAlgorithm class.
 * It creates an instance of the class, initializes a sample graph, and invokes the <i>bellmanFord()</i> method with the graph and source vertex as arguments.</p>
 * <p>It's important to note that the Bellman-Ford algorithm is designed to work with weighted directed graphs and can handle
 * graphs with negative edge weights. However, it has a time complexity of O(V * E), where V is the number of vertices
 * and E is the number of edges, which makes it less efficient than some other algorithms for finding shortest paths.</p>
 *
 * <p><u><b>License:</b></u></p>
 * <p>Version 1.0 </p>
 * 2023/05/20
 * <p>Attribution: <a href="https://creativecommons.org/licenses/by/4.0/">CC BY</a></p>
 * <p>Adrian Morgenthal <a href="https://github.com/Voraxx">Github</a></p>
 */

public class BellmanFord {

    /**
     * Finds the shortest path from a given source vertex to all other vertices in the graph.
     *
     * @param graph  The weighted graph represented as an adjacency matrix.
     * @param source The source vertex.
     */
    public static void bellmanFord(int[][] graph, int source) {
        int numVertices = graph.length;
        int[] distances = new int[numVertices];

        // Initialize all distances as infinity except for the source vertex
        Arrays.fill(distances, Integer.MAX_VALUE);
        distances[source] = 0;

        // Iterate over all vertices-1 times
        for (int i = 0; i < numVertices - 1; i++) {
            // Iterate over all edges
            for (int j = 0; j < numVertices; j++) {
                for (int k = 0; k < numVertices; k++) {
                    // Relax the edge if a shorter path is found
                    if (graph[j][k] != 0 && distances[j] != Integer.MAX_VALUE
                            && distances[j] + graph[j][k] < distances[k]) {
                        distances[k] = distances[j] + graph[j][k];
                    }
                }
            }
        }

        // Check for negative cycles
        for (int j = 0; j < numVertices; j++) {
            for (int k = 0; k < numVertices; k++) {
                if (graph[j][k] != 0 && distances[j] != Integer.MAX_VALUE
                        && distances[j] + graph[j][k] < distances[k]) {
                    System.out.println("The graph contains a negative cycle");
                    return;
                }
            }
        }

        // Print the shortest distances
        System.out.println("Vertex\t\tDistance");
        for (int i = 0; i < numVertices; i++) {
            System.out.println(i + "\t\t" + distances[i]);
        }
    }

    /**
     * The main method demonstrates the usage of the Bellman-Ford algorithm.
     *
     * @param args The command line arguments.
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

        bellmanFord(graph, 0);
    }
}

