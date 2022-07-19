package com.training;

import java.util.Set;
import java.util.TreeSet;

public class Treeset {
	
	public static void main(String[]args)
	{
		Set<String>str=new TreeSet<String>();
		
		str.add("apple");
		str.add("orange");
		str.add("apple");
		str.add("pineapple");
		str.add("orange");
		str.add("banana");
		
		System.out.println("Output-"+str);
		
		
	}
	
	
	
}


