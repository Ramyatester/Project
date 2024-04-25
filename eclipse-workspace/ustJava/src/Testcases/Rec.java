package Testcases;

import java.util.HashMap;

public class Rec {
	
	public static void getChar(String Name ) {
		HashMap <Character, Integer> charCount = new HashMap<Character, Integer>();
	char strArray[] = Name.toCharArray();
	for(char c: strArray) 
	{
		
		if (charCount.containsKey(c)){
			
		charCount.put(c,charCount.get(c)+1);
		}
		else 
			charCount.put(c, 1);
		
	}
	System.out.println(Name +":" + charCount);
	}
	public static void main(String args[]) {
		getChar("Ramya");
		
		
	}

}
