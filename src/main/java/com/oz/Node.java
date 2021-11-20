package com.oz;

import java.util.ArrayList;

public class Node {

    private ArrayList<Vector> vectors;

    private final String name;

    public Node(String name) {
        this.name = name;
        vectors = new ArrayList<Vector>();
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

    public Vector getNearestVector() {
        int distance = Integer.MAX_VALUE;
        Vector nearestVector = null;
        for (Vector vector : vectors) {
            if (vector.getDistance() < distance && vector.isVisited() == false) {
                distance = vector.getDistance();
                nearestVector = vector;
            }
        }

        if (nearestVector == null) {
            System.err.println("There is no node to go!");
        } else {
            System.out
                    .println("Nearest Node: " + nearestVector.getNode().getName() + ": " + nearestVector.getDistance());
            nearestVector.setVisited(true);
        }
        return nearestVector;
    }

}
