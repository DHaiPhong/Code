package Test2;

import java.util.*;

class Graph {
    int distance[];
    Set<Integer> visited;
    PriorityQueue<Node> pQueue;
    int nodeAmount;
    List<List<Node> > addNode;

    public Graph(int nodeAmount) {
        this.nodeAmount = nodeAmount;
        distance = new int[nodeAmount];
        visited = new HashSet<Integer>();
        pQueue = new PriorityQueue<Node>(nodeAmount, new Node());
    }

    public void algo_dijkstra(List<List<Node> > adj_list, int src_vertex)
    {
        this.addNode = adj_list;

        for (int i = 0; i < nodeAmount; i++)
            distance[i] = Integer.MAX_VALUE;

        pQueue.add(new Node(src_vertex, 0));

        distance[src_vertex] = 0;
        while (visited.size() != nodeAmount) {

            int u = pQueue.remove().node;

            visited.add(u);
            graph_adjacentNodes(u);
        }
    }
    private void graph_adjacentNodes(int u)   {
        int edgeDistance = -1;
        int newDistance = -1;
        for (int i = 0; i < addNode.get(u).size(); i++) {
            Node v = addNode.get(u).get(i);
            if (!visited.contains(v.node)) {
                edgeDistance = v.distance;
                newDistance = distance[u] + edgeDistance;
                if (newDistance < distance[v.node])
                    distance[v.node] = newDistance;
                pQueue.add(new Node(v.node, distance[v.node]));
            }
        }
    }
}
