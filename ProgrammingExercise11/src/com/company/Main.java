package com.company;

public class Main {

    public static void main(String args[]) {
        char[] data = {'1', '2', '3', '9'};
        int sum = 0;
        for(int x=0; x<data.length ;x++)
            sum += Character.getNumericValue(data[x]);
        System.out.println("SUM of char numbers from array = " +sum);
    }
}

