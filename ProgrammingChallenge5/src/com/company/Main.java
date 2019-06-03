package com.company;

public class Main {

    public static void main(String[] args) {
	/*
	Please make this snippet throw an exception at the right place:

public class Main {public static void main(String[] args) {int[] arr = new int[10];System.out.println(arr[9001]);}}
	*/
	    int [] arr = new int [10];
        try {
            System.out.println(arr[9001]);
        }
        catch(Exception e) {
            System.out.println("You can't print, out of bounds.");
        }
    }
}
