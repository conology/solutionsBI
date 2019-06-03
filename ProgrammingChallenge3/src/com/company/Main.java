package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*Write a method that returns a comma separated string based on a given list of
        integers. Each element should be preceded by the letter 'e' if the number is even,
        and preceded by the letter 'o' if the number is odd. For example, if the input list is (3,44),
        the output should be 'o3,e44'.*/

        //rezerviraj prostor za 2 števili
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(0, 3);
        integers.add(1,44);
        System.out.println(getString(integers));


    }

    public static String getString(List<Integer> list) {
        //pejdi čez arraylist in poglej ali je sodo ali liha št in pripni o ali e
        StringBuilder sb = new StringBuilder();
        for (Integer i: list){
            if(i%2==0){
                sb.append("e");
                sb.append(i);
            }
            else{
                sb.append("o");
                sb.append(i);
            }
        }
        sb.insert(2,",");

        return sb.toString();
    }
}
