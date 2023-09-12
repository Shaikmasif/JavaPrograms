
public class UpperLowerCounter {
	void caseCounter(String s)
	{
		int upper=0;
		int lower=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			if(Character.isUpperCase(s.charAt(i)))
			{
				upper++;
			}
			if(Character.isLowerCase(s.charAt(i)))
			{
				lower++;
			}
		}
		System.out.println("Uppercase letter is the string "+s+" is "+upper);
		System.out.println("Lowercase letter is the string "+s+" is "+lower);
		
	}

}
