package Test2;

import java.util.Comparator;

class Node implements Comparator<Node> {
    public int node;
    public int distance;
    public Node() { }

    public Node(int node, int distance) {
        this.node = node;
        this.distance = distance;
    }

    public int getNode() {
        return node;
    }

    public void setNode(int node) {
        this.node = node;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    @Override
    public int compare(Node node1, Node node2)
    {
        if (node1.distance < node2.distance)
            return -1;
        if (node1.distance > node2.distance)
            return 1;
        return 0;
    }
}
