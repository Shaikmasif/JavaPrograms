
public class CaseConverter {
	StringBuffer caseConvert(String s)
	{
		StringBuffer str=new StringBuffer();
		for(int i=0;i<=s.length()-1;i++)
		{
			if(Character.isUpperCase(s.charAt(i)))
			{
				str.append(Character.toLowerCase(s.charAt(i)));
			}
			else if(Character.isLowerCase(s.charAt(i)))
			{
				str.append(Character.toUpperCase(s.charAt(i)));
			}
			else
			{
				str.append(s.charAt(i));
			}
		}
		return str;
	}

}
