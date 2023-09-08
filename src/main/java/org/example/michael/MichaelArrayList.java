package org.example.michael;

import org.example.datastructures.MyList;

/**
 * Class which implements {@link MyList} using a primitive int[] array
 */
public class MichaelArrayList implements MyList {

    int[] ints={1,2,3};

    @Override
    public void add(int s) {



    }


    @Override
    public int size() {
        return 0;
    }
    public static void main(String[] args){
        MichaelArrayList michaelArrayList = new MichaelArrayList();
        michaelArrayList.add(1);
        System.out.println(michaelArrayList);
    }
}
