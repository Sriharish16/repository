package com.training.Occurrence;

import java.util.*;
public class Occurrence{
	public static void main(String[]args) {
	
	List<Integer>str=new ArrayList<Integer>();
	
	str.add(1);
	str.add(5);
	str.add(2);
	str.add(1);
	str.add(2);
	str.add(6);
	str.add(7);
	str.add(1);
	
	System.out.println(str);
	int key=5;
	
	switch(key) {
	case 1:
	int Pos=str.indexOf(1);
	System.out.println(Pos);
	break;
	
	case 2:
		int Pos1=str.indexOf(2);
		System.out.println(Pos1);
		break;
		
}
	
	}
}

