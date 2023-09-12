
public class AutomorphicNumber {
	boolean checkAutomorphic(int n)
	{
		int square=n*n;
		while(n>0)
		{
			int rem1=n%10;
			int rem2=square%10;
			if(rem1!=rem2)
			{
				return false;
			}
			else
			{
				n=n/10;
				square=square/10;
			}
		}
		return true;
	}

}
