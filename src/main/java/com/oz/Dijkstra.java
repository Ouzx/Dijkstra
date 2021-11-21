package com.oz;

public class Dijkstra {
    private Graph graph;

    public Dijkstra(Graph graph) {
        this.graph = graph;
    }

    public void run() {
        updateGraph(graph.getStartNode());
    }

    private void updateGraph(Node node) {
        Node currentNode = node;

        int distance = Integer.MAX_VALUE;
        Vector nearestVector = null;

        for (Vector vector : currentNode.getVectors()) {
            if (vector.getNode().isVisited() == false) {
                int tempDistance = currentNode.getRelativeDistance() + vector.getDistance();
                if (tempDistance < distance) {
                    distance = tempDistance;
                    nearestVector = vector;
                }
                if (tempDistance < vector.getNode().getRelativeDistance()) {
                    vector.getNode().setRelativeDistance(tempDistance);
                    vector.getNode().setPrevious(currentNode);
                }
            }
        }
        if (nearestVector != null) {
            nearestVector.getNode().setVisited(true);
            updateGraph(nearestVector.getNode());
        }
    }

}
