package com.shiftedtech.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

//http://www.vogella.com/tutorials/JavaRegularExpressions/article.html

public class RegularExpressions2 {

	public static void main(String[] args) {
		
		//Pattern pattern = Pattern.compile("\\w+");
		Pattern pattern = Pattern.compile("example");
		
		String EXAMPLE_TEST = "This is my small example string which I'm going example to use for pattern matching.";
		
		Matcher matcher = pattern.matcher(EXAMPLE_TEST);
		while (matcher.find()) {
            System.out.print("Start index: " + matcher.start());
            System.out.print(" End index: " + matcher.end() + " ");
            System.out.println(matcher.group());
        }
	
		  String s = "humbapumpa jxm";
	
		  try {
			  assertTrue(s.matches(".*(jim|joe).*"));
			} catch (AssertionError e) {
				System.out.println("My assert is not working");
			}
	        
	        
	        System.out.println("I am working");
	        
	        s = "humbapumpa jom";
	        assertFalse(s.matches(".*(jim|joe).*"));
	        s = "humbaPumpa joe";
	        assertTrue(s.matches(".*(jim|joe).*"));
	        s = "humbapumpa joe jim";
	        assertTrue(s.matches(".*(jim|joe).*"));
		
	}

}
