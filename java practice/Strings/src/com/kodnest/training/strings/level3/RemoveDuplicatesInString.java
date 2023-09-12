package com.kodnest.training.strings.level3;

public class RemoveDuplicatesInString {
	String removeDupicates(String s)
	{
		String str="";
		int count;
		for(int i=0;i<=s.length()-1;i++)
		{
			count=0;
			for(int j=0;j<=str.length()-1;j++)
			{
				if(s.charAt(i)==str.charAt(j))
				{
					count++;
					break;
				}
			}
			if(count==0)
			{
				str=str+s.charAt(i);
			}
			}
		
		return str;
	}

}
