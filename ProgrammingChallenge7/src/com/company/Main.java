package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	/*
	  Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value.
	  Return the number of clumps in the given array.

countClumps([1, 2, 2, 3, 4, 4]) → 2
countClumps([1, 1, 2, 1, 1]) → 2
countClumps([1, 1, 1, 1, 1]) → 1
	*/

        ArrayList<Integer> countClumps = new ArrayList<Integer>(
                List.of(1, 2, 2, 3, 4, 4));
        ArrayList<Integer> countClumps2 = new ArrayList<Integer>(
                List.of(1, 1, 2, 1, 1));
        ArrayList<Integer> countClumps3 = new ArrayList<Integer>(
                List.of(1, 1, 1, 1, 1));

        System.out.println("Number of clumps in array " + countClumps + " = " + nubmerOfClumps(countClumps));
        System.out.println("Number of clumps in array " + countClumps2 + " = " + nubmerOfClumps(countClumps2));
        System.out.println("Number of clumps in array " + countClumps3 + " = " + nubmerOfClumps(countClumps3));


    }
        public static int nubmerOfClumps(ArrayList<Integer> arrayList){

        int countClump = 0;
        int adjacentEquals = 0;
        int current = arrayList.get(0);
        for(int i=1; i<arrayList.size(); i++){
            if(current == arrayList.get(i)){
                adjacentEquals++;
            }
            else if (adjacentEquals>0){
                countClump++;
                adjacentEquals = 0;
            }
            current = arrayList.get(i);
        }
        if(adjacentEquals>0)
            countClump++;
        return countClump;
        }
}
