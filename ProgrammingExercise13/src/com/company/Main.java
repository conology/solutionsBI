/*Write a Java program to find the row, column position of a specified number (row, column position)
in a given 2-dimensional array.*/

package com.company;

public class Main {

    public static void main(String[] args) {

        int[][] list = {{2, 3, 5, 6, 6}, {2, 4, 5, 7, 8}, {5, 5, 6, 8, 8}, {5, 7, 7, 8, 9}};
        int searchValue = 8;
        int positionX = -1;
        int positionY = -1;
        System.out.print("results: ");
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                if (list[i][j] == searchValue) {
                    positionX = i;
                    positionY = j;
                    if (positionX == -1) {
                        System.out.print("None");
                    } else {
                        System.out.print("(" + positionY + "," + positionX + ");");
                    }

                }
            }
        }
    }
}
