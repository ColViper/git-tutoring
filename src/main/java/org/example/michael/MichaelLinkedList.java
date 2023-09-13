package org.example.michael;

import org.example.datastructures.MyList;
import org.example.datastructures.Node;

import java.util.Scanner;

/**
 * Class which implements {@link MyList} using a one-directional linked list
 */


public class MichaelLinkedList implements MyList {

    private Node rootNode;

    public MichaelLinkedList() {
        this.rootNode = null;
    }

    @Override
    public void add(int content) {
        if (rootNode == null) {
            rootNode = new Node(null, content);
            return;
        }

        Node cursor = rootNode;
        while (cursor.getNextElement() != null) {
            cursor = cursor.getNextElement();
        }

        Node nextNode = new Node(null, content);
        cursor.setNextElement(nextNode);
    }

    public int size() {
        Node cursor = rootNode;
        int size = 1;
        while (cursor.getNextElement() != null) {
            cursor = cursor.getNextElement();
            size++;

        }
        return size;
    }

    @Override
    public int get(int index) {
        if (index >= this.size() || index < 0) {
            throw new IndexOutOfBoundsException("index is missing");
        }

        Node cursor = rootNode;
        int cursorIndex = 0;
        while (index != cursorIndex) {
            cursor = cursor.getNextElement();
            cursorIndex++;
        }

        return cursor.getContent();
    }

    public static void main(String[] args) {
        MyList michaelLinkedList = new MichaelLinkedList();
        michaelLinkedList.add(1);
        michaelLinkedList.add(2);
        michaelLinkedList.add(3);
        michaelLinkedList.add(4);
        michaelLinkedList.add(5);

        for (int i = 0; i < michaelLinkedList.size(); i++) {
            System.out.println(michaelLinkedList.get(i));
        }

//        System.out.println(michaelLinkedList);
//        System.out.println("size = " + michaelLinkedList.size());
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter your text");
//        int next = scanner.nextInt();
//        System.out.println(next);
//        System.out.println(michaelLinkedList.get(next));

    }

    @Override
    public String toString() {
        return "MichaelLinkedList{" +
                "rootNode=" + rootNode +
                '}';
    }


}
