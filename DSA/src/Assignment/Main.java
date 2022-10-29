package Test2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int nodeAmount = 9;
        int source = 0;

        List<List<Node>> addNode = new ArrayList<List<Node> >();

        for (int i = 0; i < nodeAmount; i++) {
            List<Node> item = new ArrayList<Node>();
            addNode.add(item);
        }

        addNode.get(0).add(new Node(1, 5));
        addNode.get(0).add(new Node(2, 3));
        addNode.get(1).add(new Node(3, 4));
        addNode.get(1).add(new Node(4, 2));
        addNode.get(1).add(new Node(5, 6));
        addNode.get(2).add(new Node(4, 5));
        addNode.get(2).add(new Node(5, 7));
        addNode.get(3).add(new Node(6, 8));
        addNode.get(4).add(new Node(5, 4));
        addNode.get(4).add(new Node(6, 7));
        addNode.get(4).add(new Node(7, 6));
        addNode.get(4).add(new Node(8, 12));
        addNode.get(5).add(new Node(7, 5));
        addNode.get(6).add(new Node(7, 6));
        addNode.get(6).add(new Node(8, 8));
        addNode.get(7).add(new Node(8, 7));

        Graph graph = new Graph(nodeAmount);
        graph.algo_dijkstra(addNode, source);


        System.out.println("The shorted path from 0 node to other nodes:");
        System.out.println("Source\t\t" + "Node#\t\t" + "Distance");
        for (int i = 0; i < graph.distance.length; i++)
            System.out.println("  " + source + " \t\t  " + i + "  \t\t\t"  + graph.distance[i]);
    }
}
