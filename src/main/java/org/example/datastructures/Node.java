package org.example.datastructures;

public class Node {

    Node nextElement;
    int content;

    public Node(Node nextElement, int content) {
        this.nextElement = nextElement;
        this.content = content;
    }

    @Override
    public String toString() {
        return "[content is " + content + " next element is " + nextElement + "]";
    }
}
