package com.company;

public class Main {

    public static void main(String[] args) {
	/*Given two strings, base and remove, return a version of the base string where all instances
	of the remove string have been removed (not case sensitive). You may assume that the remove string is length 1 or more.
	Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".

withoutString("Hello there", "llo") → "He there"
withoutString("Hello there", "e") → "Hllo thr"
withoutString("Hello there", "x") → "Hello there"*/
		String hellothere = "Hello there";
		String llo = "llo";
		String e = "e";
		String x = "x";
		System.out.println(withoutString(hellothere, llo));
		System.out.println(withoutString(hellothere, e));
		System.out.println(withoutString(hellothere, x));
    }

    public static String withoutString(String base, String remove){
		return "(" + base + ", " + remove + ") -> " + base.replaceAll(remove, "");
	}

}