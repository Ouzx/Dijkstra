package com.oz;

public class Vector {
    private final Node node;
    private final int distance;

    public Vector(Node node, int distance) {
        if (distance < 0) {
            throw new IllegalArgumentException("Distance must be positive");
        }
        this.distance = distance;
        this.node = node;
    }

    // get distance is the distance between the current node and the target node
    public int getDistance() {
        return distance;
    }

    // target node
    public Node getNode() {
        return node;
    }

}
