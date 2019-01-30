package com.shiftedtech.java;

public class JavaStringTest {

	public static void main(String[] args) {

		String emptyString = " ";
		//""->means string with zero value or 0 length " "->string with space character or 1 length,its a ascii character means its a something 
		//empty string means is a string but it has zero length,it is variable string which  pointing to the memory which has nothing which is empty  
		//its already intialize the object that is been created  
		String nullString = null;// it not intialize 
		//when you do .length which will give you zero it will throw an exception it would say object never created   
		//java.lang.throw an exception why its null because its never intialize 
		//its a favoroite exceptio  b/c alot of time we forgot to intialize the object 
		// string never got intialize 
		System.out.println(emptyString.length());
		//System.out.println(nullString.length());
		
		String myName = "IftekharaAlam Ivaan \nX";
		//    \n is not printable charcter it will print upto ivaan and next line it will print x 
		//\n basically it is enter key  at the time of length it will give you 21 not 20 but when you print chracter it will not print \n
		System.out.println("String: " + myName);
		int length = myName.length();
		System.out.println("Length: " + length);
		System.out.println("" + length);
		//this is object data type string 
		//if you want to convert object datatype to primitive datatype ,you can string into array of character
		char[] myStringChar = myName.toCharArray();
		//it will give me every string into one charcter 
		//once you convert string into charcter you can do alot of things 
		////if you want to print one character by charcter,you can see one charcater at atime with the help of loop  
		System.out.println("My Char Array Lenght: " + myStringChar.length);
		for(int i = 0; i < myStringChar.length; i++) {
			System.out.print(myStringChar[i]);
			System.out.print("-");
			System.out.println( (int)myStringChar[i]);
		}
		
		System.out.println("Rev: String");
		String reveString = "";
		StringBuilder sb = new StringBuilder();	
		for(int i = myStringChar.length - 1; i >=0; i--) {
			System.out.println(myStringChar[i]);
			//reveString = reveString + myStringChar[i];
			sb.append(myStringChar[i]);
		}
		reveString = sb.toString();
		System.out.println("Rev String:" + reveString);
		
		
		System.out.println(myName.startsWith("Iftekhar"));
		System.out.println(myName.toUpperCase().startsWith("iftekhar".toUpperCase()));
		
		System.out.println(myName.toUpperCase().contains("alam".toUpperCase()));
		
		System.out.println(myName.endsWith("X"));
		
		System.out.println(myName.startsWith("Iftekhar") && myName.endsWith("X") && myName.contains("Ivaan"));
		System.out.println("##################################");
		int x1 = myName.indexOf(" ");
		System.out.println(x1);
		int x2 = myName.indexOf(" ", x1 + 1);
		System.out.println(x2);
		String middleName = myName.substring(x1 + 1, x2);
		System.out.println("Middle Name:" + middleName);
		int x3 = myName.lastIndexOf("\n");
		String lastName = myName.substring(x2+1, x3);
		System.out.println("LastName:" + lastName);
		
		String[] words =  myName.split(" ");
		for(String s : words) {
			System.out.println(s);
		}
		
		String test = "test1,test2,test3";
		String[] myTest = test.split(",");
		
		
	}

}
