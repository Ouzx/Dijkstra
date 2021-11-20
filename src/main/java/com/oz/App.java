package com.oz;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        printGraph(Graph());
    }

    public static Node[] Graph() {
        Node A = new Node("A");
        Node B = new Node("B");
        Node C = new Node("C");
        Node D = new Node("D");
        Node E = new Node("E");
        Node F = new Node("F");

        // A
        A.addVector(new Vector(B, 7));
        A.addVector(new Vector(C, 4));
        A.addVector(new Vector(E, 2));

        // B
        B.addVector(new Vector(A, 7));
        B.addVector(new Vector(C, 3));
        B.addVector(new Vector(D, 2));
        B.addVector(new Vector(F, 6));

        // C
        C.addVector(new Vector(A, 4));
        C.addVector(new Vector(B, 3));
        C.addVector(new Vector(D, 8));
        C.addVector(new Vector(E, 1));

        // D
        D.addVector(new Vector(B, 2));
        D.addVector(new Vector(C, 8));
        D.addVector(new Vector(F, 3));
        D.addVector(new Vector(E, 10));

        // E
        E.addVector(new Vector(A, 2));
        E.addVector(new Vector(C, 1));
        E.addVector(new Vector(D, 10));

        // F
        F.addVector(new Vector(B, 6));
        F.addVector(new Vector(D, 3));

        return new Node[] { A, B, C, D, E, F };

    }

    public static void printGraph(Node[] nodes) {
        for (Node node : nodes) {
            System.out.println("----------------------");
            System.out.println(node.getName() + ": ");
            for (Vector vector : node.getVectors()) {
                System.out.println("\t" + vector.getNode().getName() + ": " + vector.getDistance());
            }
            System.out.println("----------------------");
        }
    }
}

// // shortest distance from this node to the target node
// public int getDistance(Node target) {
// int distance = Integer.MAX_VALUE;
// for (Vector vector : vectors) {
// if (vector.getNode().equals(target)) {
// distance = vector.getDistance();
// break;
// }
// }
// return distance;
// }
