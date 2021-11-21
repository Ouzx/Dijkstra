package com.oz;

import java.util.ArrayList;

public class Node {

    private ArrayList<Vector> vectors;
    private final String name;
    private Node previous;
    private int relativeDistance;
    private boolean visited;

    public Node(String name) {
        this.name = name;
        vectors = new ArrayList<Vector>();
        relativeDistance = Integer.MAX_VALUE;
    }

    // Node name
    public String getName() {
        return name;
    }

    // Vectors
    public void addVector(Vector vector) {
        vectors.add(vector);
    }

    public ArrayList<Vector> getVectors() {
        return vectors;
    }

    public void setRelativeDistance(int distance) {
        if (distance < 0) {
            throw new IllegalArgumentException("Distance must be positive");
        }
        this.relativeDistance = distance;
    }

    public int getRelativeDistance() {
        return relativeDistance;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public Node getPrevious() {
        return previous;
    }

    // bool for visited
    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

}
