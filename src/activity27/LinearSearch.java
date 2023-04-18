package activity27;

import java.util.ArrayList;
import java.util.Arrays;

public class LinearSearch {

    public int linear(int key, int[] array)
    {
        ArrayList <Integer> ar = new ArrayList<Integer>(Arrays.asList(3,6,2,9,0,13,34,23,10,32,27));
        int counter = 0;
        for (int i = 0; i < array.length; i++)
        {
            System.out.println("comparison: "+ ++counter);
            if (key == array[i])
                return i;
            }
        return -1;
    }

    }
