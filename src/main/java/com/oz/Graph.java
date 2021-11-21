package com.oz;

public class Graph {
    private final Node startNode;
    private Node[] graph;
    private Stack stack;

    public Graph(Node[] graph, Node startNode) {
        this.startNode = startNode;
        this.startNode.setVisited(true);

        this.graph = graph;

        startNode.setRelativeDistance(0);
        stack = new Stack();

    }

    public Node[] getGraph() {
        return graph;
    }

    public void setGraph(Node[] graph) {
        this.graph = graph;
    }

    public Node getStartNode() {
        return startNode;
    }

    private void printPath(Node endNode) {
        Node currentNode = endNode;
        if (endNode == startNode)
            return;
        while (currentNode != null && endNode != null) {
            this.stack.push(currentNode);
            currentNode = currentNode.getPrevious();
        }

        System.out.println("=============================");
        String path = "Target Node: " + endNode.getName();
        path += "\n";
        int lastDistance = 0;
        while (this.stack.isEmpty() == false) {
            Node node = this.stack.pop();
            path += node.getName();
            if (stack.peek() != null)
                path += " -> ";
            lastDistance = node.getRelativeDistance();
        }
        path += "\n";
        path += "Cost in total: " + lastDistance;
        System.out.println(path);

    }

    public void printGraph() {
        for (Node node : graph) {
            printPath(node);
        }
        System.out.println("=============================");
    }

    public void printMatrix() {
        for (Node node : graph) {
            System.out.println("----------------------");
            System.out.println(node.getName() + ": ");
            for (Vector vector : node.getVectors()) {
                System.out.println("\t" + vector.getNode().getName() + ": " + vector.getDistance());
            }
            System.out.println("----------------------");
        }
    }

    public void ResetGraph() {
        for (Node node : graph) {
            node.setVisited(false);
            node.setRelativeDistance(0);
            node.setPrevious(null);
        }
    }
}
