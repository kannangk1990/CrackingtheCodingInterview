package StringPrograms;

import java.util.Scanner;

public class ReplaceSpaceWithString {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter String:");
		String originalString = in.nextLine();
		System.out.println("Enter True Length:");
		int trueLength = in.nextInt();
		char[] strArray = originalString.toCharArray();
		
		replaceSpaceWithString(strArray,trueLength);

	}

	static void replaceSpaceWithString(char[] strArray,int trueLength)
	{
		
		
		char[] strArr = new char[trueLength*2];
		int index,spaceCount=0;
		
		for(int i=0;i<trueLength;i++)
		{
			if(strArray[i]==' ')
				spaceCount++;
		}
		
		index=trueLength+spaceCount*2;
		
		if(trueLength<strArray.length)
			strArray[trueLength]='\0';
		
		for(int i=trueLength-1;i>=0;i--)
		{
			if(strArray[i]==' ')
			{
				strArr[index-1]='0';
				strArr[index-2]='2';
				strArr[index-3]='%';
				index=index-3;
			}
			else
			{
				strArr[index-1]=strArray[i];
				index--;
			}
		}
		String strOut = new String(strArr);
		
		System.out.println("Output String:"+strOut );	
		
	}
}
