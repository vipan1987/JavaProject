package com.shiftedtech.qa;

public class Test {

	public static void main(String[] args) {
		printNumber(10);
		printNumber(10,20);
		
		int[] num = {12,34};
		printNumber(num);
		printNumber(40,50,60,70);
	}

	public static void printNumber(int num) {
		System.out.println("Num: " + num);
	}
	public static void printNumber(int num1, int num2) {
		System.out.println("Num: " + num1);
		System.out.println("Num: " + num2);
	}
	/*
	public static void printNumber(int[] num) {
		for(int x : num) {
		System.out.println("Num: " + x);
		}
	}*/
	
	public static void printNumber(int... num) {
		for(int x : num) {
		System.out.println("Num: " + x);
		}
	}
	
	
}
