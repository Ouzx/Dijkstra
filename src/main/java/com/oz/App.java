package com.oz;

public class App {

    static Node A = new Node("A");
    static Node B = new Node("B");
    static Node C = new Node("C");
    static Node D = new Node("D");
    static Node E = new Node("E");
    static Node F = new Node("F");

    public static void main(String[] args) {
        Graph graph = new Graph(GraphData(), C);
        Dijkstra dijkstra = new Dijkstra(graph);
        dijkstra.run();
        graph.printGraph();
        graph.printMatrix();
    }

    public static Node[] GraphData() {

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
}