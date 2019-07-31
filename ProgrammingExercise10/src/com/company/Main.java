package com.company;

public class Main {

    public static void main(String[] args) {
	/*1. Write a recursive function that computes the sum of all numbers from 1 to n, where n is given as parameter.*/
    //return the sum 1+ 2+ 3+ ...+ n
    // int sum(int n)

        //printing out 1. TASK
        System.out.println("SUM of all numbers from 1 to n = "+sum(4));

    /*2. Write a recursive function that finds and returns the minimum element in an array, where the array and
    its size are given as parameters.*/
    //return the minimum element in a[]
    // int findmin(int a[], int n)

        //printing out 2. TASK
        int a[]={7, 20, -5, 1, 13, -100, -3};
        int n = a.length;
        System.out.println("Minimum element of the array is: "+findMin(a,n));

    /*3. Write a recursive function that computes and returns the sum of all elements
    in an array, where the array and its size are given as parameters.*/
    //return the sum of all elements in a[]
    //int findsum(int a[], int n)

        //printing out 3. TASK
        System.out.println("SUM of elements in the array = " +  findSum(a, n));

    /*4. Write a recursive function that determines whether an array is a palindrome, where the array and
    its size are given as parameters.*/
    //returns 1 if a[] is a palindrome, 0 otherwise
    //int ispalindrome(char a[], int n)

        //printing out 4. TASK
        int [] b = {1,2,2,1};
        int m = b.length;
        if (isPalindrome(b, 0, m - 1) == 1)
            System.out.print("Palindrome");
        else
            System.out.println( "Not Palindrome");
    }


    // 1. TASK - recursive function that computes the sum of all numbers from 1 to n, where n is given as parameter
    public static int sum(int n){
      //if element n<=1
        if (n<=1){
            return n;
        }
        else {
            return n + sum(n - 1);
        }
    }

    // 2. TASK - recursive function that finds and returns the minimum element in an array, where the array
    // and its size are given as parameters.

    public static int findMin(int a[], int n)
    {
        //if only one element is present, return it
        if(n == 1)
            return a[0];
        //return the minimal element
        return Math.min(a[n-1], findMin(a, n-1));
    }

    //3.TASK recursive function that computes and returns the sum of all elements
    //in an array, where the array and its size are given as parameters.

     public static int findSum(int a[], int n)
        {
            if (n <= 0)
                return 0;
            return (findSum(a, n - 1) + a[n - 1]);
        }

     //4. TASK recursive function that determines whether an array is a palindrome, where the array and
    //    its size are given as parameters


    static int isPalindrome(int arr[], int begin, int end)
    {
        // base case
        if (begin >= end) {
            return 1;
        }
        if (arr[begin] == arr[end]) {
            return isPalindrome(arr, begin + 1, end - 1);
        }
        else {
            return 0;
        }
    }
}

