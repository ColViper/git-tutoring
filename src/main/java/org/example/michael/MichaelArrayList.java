package org.example.michael;

import org.example.datastructures.MyList;

import java.util.Arrays;

/**
 * Class which implements {@link MyList} using a primitive int[] array
 */
public class MichaelArrayList implements MyList {

    int[] ints;
    public MichaelArrayList(){
        this.ints = new int[1];
    }

    @Override
    public int size() {
        return ints.length;
    }

    @Override
    public void add(int s) {
        int size=ints.length;
        int[] ints1 = new int[size+1];
        for (int i = 0; i <= size; i++) {
            if(ints[0] == 0){
                ints[0]=s;
            }
            /*if(i == size){
                ints1[i+1] =s;
            }
            else{*/
                ints1[i]=ints[i];
            //}
        }


    }



    public static void main(String[] args){
        MichaelArrayList michaelArrayList = new MichaelArrayList();
        michaelArrayList.add(1);
        michaelArrayList.add(2);
        michaelArrayList.add(3);
        System.out.println(michaelArrayList);

    }

    @Override
    public String toString() {
        return "MichaelArrayList{" +
                "ints=" + Arrays.toString(ints) +
                '}';
    }
}
