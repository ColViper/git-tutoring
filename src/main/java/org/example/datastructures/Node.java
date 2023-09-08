package org.example.datastructures;

public class Node {

    private Node nextElement;
    private int content;

    public Node(Node nextElement, int content) {
        this.nextElement = nextElement;
        this.content = content;
    }

    public Node getNextElement() {
        return nextElement;
    }

    public int getContent() {
        return content;
    }

    public void setNextElement(Node nextElement) {
        this.nextElement = nextElement;
    }

    @Override
    public String toString() {
        return "[content is " + content + " next element is " + nextElement + "]";
    }
}