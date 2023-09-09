package org.example.michael;

import org.example.datastructures.MyList;

import java.util.Arrays;

/**
 * Class which implements {@link MyList} using a primitive int[] array
 */
public class MichaelArrayList implements MyList {

    int[] ints;

    public MichaelArrayList() {
        this.ints = null;
    }

    @Override
    public int size() {
        return ints.length;
    }

    @Override
    public int get(int index) {
        return ints[index];
    }

    @Override
    public void add(int valueToAdd) {
        if (ints == null) {
            ints = new int[]{valueToAdd};
            return;
        }

        int[] intsCopy = new int[ints.length + 1];
        System.arraycopy(ints, 0, intsCopy, 0, ints.length);
        intsCopy[ints.length] = valueToAdd;
        ints = intsCopy;
    }

    public static void main(String[] args) {
        MichaelArrayList michaelArrayList = new MichaelArrayList();
        michaelArrayList.add(1);
        michaelArrayList.add(2);
        michaelArrayList.add(3);
        System.out.println(michaelArrayList);
        System.out.println(michaelArrayList.get(1));

    }

    @Override
    public String toString() {
        return "MichaelArrayList{" +
                "ints=" + Arrays.toString(ints) +
                '}';
    }
}
