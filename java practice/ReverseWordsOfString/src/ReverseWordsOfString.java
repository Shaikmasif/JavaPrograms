import java.util.Arrays;

public class ReverseWordsOfString {
	String[] reverseString(String s)
	{
		String str[]=s.split(" ");
		String rev[]=new String[str.length];
		for(int i=0;i<=str.length-1;i++)
		{
			rev[i]=reverseWord(str[i]);
		}
		return rev;
	}

	String reverseWord(String s)
	{
		char ch[]=s.toCharArray();
		char ch2[]=new char[ch.length];
		
		for(int i=0,j=ch.length-1;i<=ch.length-1;i++)
		{
			ch2[j]=ch[i];
			j--;
		}
		return new String(ch2);
	}

}
