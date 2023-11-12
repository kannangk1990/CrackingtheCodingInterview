package StringPrograms;

import java.util.Scanner;

public class PermutationusingString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter str1:");
		String str1= in.nextLine();
		System.out.println("Enter str2:");
		String str2= in.nextLine();
		if(isPermutation(str1,str2))
		{
			System.out.println("Permutation");
		}
		else
		{
			System.out.println("Not Permutation");
		}

	}
	
	static boolean isPermutation(String str1,String str2)
	{
		if(str1.length()!=str2.length())
			return false;
		
		byte[] charSet = new byte[128];
		
		for(int i=0;i<str1.length();i++)
		{
			int val=str1.charAt(i);
			charSet[val]++;
		}
		
		for(int i=0;i<str2.length();i++)
		{
			int val=str2.charAt(i);
			charSet[val]--;
			
			if(charSet[val]<0)
				return false;
		}
		
		return true;
	}

}
