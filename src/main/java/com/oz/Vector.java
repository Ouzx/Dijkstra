package com.oz;

public class Vector {
    private final Node node;
    private boolean visited;
    private int distance;

    public Vector(Node node, int distance) {
        this.distance = distance;
        this.node = node;
    }

    // get distance is the distance between the current node and the target node
    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    // target node
    public Node getNode() {
        return node;
    }

    // bool for visited
    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }
}
