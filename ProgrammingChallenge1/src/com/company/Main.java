package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
       /* User input integer values in 10 cell array.

        He wants to find product of greatest and smallest number present in array.

                Example:

        Input:


        3
        2
        4
        5
        6
        8
        9
        7
                -1
        10
        Output:
        -10*/

        //seznam 10 števil

        int seznam[] = new int[10];

        //nafilaj seznam z 10 števili

        for(int i=0; i<10; i++){
            seznam[i] = new Scanner(System.in).nextInt();
        }
        //izpis inputa
        for(int i=0; i<10; i++){
            System.out.println(seznam[i]);
        }
        //najdi najvišje število v seznamu
        int max = seznam[0]; // priredi vrednost števila na prvi element v tabeli
        for(int i=1; i<10; i++){
            if(seznam[i]>max){
                max = seznam[i];
            }
        }
        // System.out.println(max);

        //najdi najnižje število v seznamu

        int min = seznam[0]; // priredi vrednost števila na prvi element v tabeli
        for(int i=1; i<10; i++){
            if(seznam[i]<min){
                min = seznam[i];
            }
        }
        System.out.println("min * max = " + max*min);
    }
}

