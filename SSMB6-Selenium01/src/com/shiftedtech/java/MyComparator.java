package com.shiftedtech.java;

import java.util.Comparator;

public class MyComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return o2.compareToIgnoreCase(o1);
	}

}
