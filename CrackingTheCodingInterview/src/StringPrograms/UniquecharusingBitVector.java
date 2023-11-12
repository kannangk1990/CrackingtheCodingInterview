package StringPrograms;

import java.util.Scanner;

public class UniquecharusingBitVector {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter text:");
		String str= in.nextLine();
		if(isUniqueChar(str))
		{
			System.out.println("Unique Characters");
		}
		else
		{
			System.out.println("Non Unique Characters");
		}

	}
	
	static boolean isUniqueChar(String str)
	{
		if(str.length()>128)
			return false;
		
		int checker=0;
		
		for(int i=0;i<str.length();i++)
		{
			int val= str.charAt(i)-'a';
			if((checker &(1<<val))>0)
				return false;
			
			checker |= (1<<val);
		}
		
		
		return true;
	}

}
