package com.training.Occurrence;

import java.util.*;
public class permutation {
    
	public static void showpermutation(String string1,String string2)
 {
	
	if(string1.length()==0) {

System.out.println(string2+ " ");

}
	
		
		
	for(int i=0;i<string1.length();i++)
	{

		
	
		char ch=string1.charAt(i);
	

		String str=string1.substring(0,i)+string1.substring(i+1);

		
		showpermutation(str,string2+ch);

		
		
}
	

}
	


public static void main(String args[]) 
{


Scanner sc= new Scanner(System.in);
	

System.out.println("Enter the Word:");

	String s= sc.next();	
	

showpermutation(s," ");


sc.close();
}
}