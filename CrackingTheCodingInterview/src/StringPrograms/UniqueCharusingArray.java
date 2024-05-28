package StringPrograms;

import java.util.Scanner;

public class UniqueCharusingArray {

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
		
		in.close();
	}
	
	static boolean isUniqueChar(String str)
	{
		
		if(str.length()>128)
			return false;
		
		boolean[] charSet = new boolean[128];
		for(int i =0;i<str.length();i++)
		{
			int val = str.charAt(i);
			if(charSet[val])
				return false;
			charSet[val]=true;
				
		}
		return true;
	}

}
