package org.example.michael;

import org.example.datastructures.MyList;
import org.example.datastructures.Node;

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
        while (cursor.getNextElement() != null){
            cursor = cursor.getNextElement();
        }

        Node nextNode = new Node(null, content);



        cursor.setNextElement(nextNode);

    }

    public int size() {
        Node cursor = rootNode;
        int size=1;
        while (cursor.getNextElement() != null){
            cursor = cursor.getNextElement();
            size++;

        }
        return size;
    }
    public static void main(String[] args){
        MichaelLinkedList michaelLinkedList = new MichaelLinkedList();
        michaelLinkedList.add(1);
        michaelLinkedList.add(2);
        michaelLinkedList.add(3);
        michaelLinkedList.add(4);
        michaelLinkedList.add(5);

        System.out.println(michaelLinkedList);
        System.out.println("size = " +michaelLinkedList.size());
    }

    @Override
    public String toString() {
        return "MichaelLinkedList{" +
                "rootNode=" + rootNode +
                '}';
    }



}
