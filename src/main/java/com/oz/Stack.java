package com.oz;

import java.util.ArrayList;

public class Stack {
    ArrayList<Node> stack = new ArrayList<Node>();

    public void push(Node node) {
        stack.add(node);
    }

    public Node pop() {
        return stack.remove(stack.size() - 1);
    }

    public Node peek() {
        if (size() == 0)
            return null;

        return stack.get(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }

}
