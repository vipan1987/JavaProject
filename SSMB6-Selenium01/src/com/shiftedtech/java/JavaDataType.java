package com.shiftedtech.java;

public class JavaDataType {

	public static void main(String[] args) {
		int yy;
		int x = 4;
	
		String xyz = "19";
		
		Integer y;
		y = Integer.parseInt(xyz);
		
		y = new Integer(x);
		
		char x1 = 'A';
		
		String name1 = "Iftekhar";
		String name2 = "Iftekhar";
		System.out.println(name1 == name2);
		
		String name3 = new String("Iftekhar");
		String name4 = new String("Iftekhar ");
		System.out.println(name3 == name4);
		
		
		System.out.println(name2.contentEquals(name4));
		
		
		System.out.println("Name1: " + name1);
		String neWName = name1.toUpperCase();
		System.out.println(name1.toLowerCase());
		System.out.println("Name1: " + name1);
		System.out.println("neWName: " + neWName);
		
		System.out.println(name4.trim().toUpperCase().contentEquals("IFTEKHAR"));
		System.out.println(name4.compareToIgnoreCase("Iftekhar "));
		
		
		
		
		
		
		
	}

}
