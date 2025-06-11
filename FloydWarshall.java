package dz.graph.dijkstra;

import dz.graph.dijkstra.frames.ds_graph.Graph;
import dz.graph.dijkstra.frames.ds_graph.Vertex;
import dz.graph.dijkstra.frames.ds_graph.Edge;

public class FloydWarshall {
    public static int INFINITY = Integer.MAX_VALUE;

    public static int[][] floydWarshall(Graph graph) {
        int size = graph.getVertices().size();
        int[][] dist = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    dist[i][j] = 0; 
                } else {
                    Vertex vi = graph.getVertices().get(i);
                    Vertex vj = graph.getVertices().get(j);
                    int weight = getEdgeWeight(graph, vi, vj);
                    dist[i][j] = (weight == INFINITY) ? INFINITY : weight;
                }
            }
        }

        for (int k = 0; k < size; k++) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (dist[i][k] != INFINITY && dist[k][j] != INFINITY && dist[i][k] + dist[k][j] < dist[i][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }

        return dist;
    }

    private static int getEdgeWeight(Graph graph, Vertex start, Vertex end) {
        for (Edge edge : start.getEdges()) {
            if (edge.getEnd().equals(end)) {
                return edge.getWeight();
            }
        }
        return INFINITY;
    }
}
