package com.nilu.arrays;
import java.util.Arrays;
public class MyArrays {
        public static void main(String[] args) {
            int arrayA[]=new int[]{2,1,3};
            int arrayB[]=new int[]{1,2,3};
            Arrays.sort(arrayA);
            boolean val=Arrays.equals(arrayA,arrayB);
           int val2= Arrays.compare(arrayA,arrayB);
           int arrayC[]=new int[10];
           Arrays.fill(arrayC,2);
            System.out.println(val);
            System.out.println(val2);
            System.out.println(Arrays.toString(arrayC));
    }
}
