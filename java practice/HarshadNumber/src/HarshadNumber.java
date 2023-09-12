
public class HarshadNumber {
	boolean checkHarshad(int n)
	{
		int temp=n;
		int sum=0;
		while(temp>0)
		{
			int rem=temp%10;
			sum=sum+rem;
			temp=temp/10;
		}
		if(n%sum==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
