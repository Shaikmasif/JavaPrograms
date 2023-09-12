
public class StrongNumber {
	int checkStrong(int n)
	{
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			sum=sum+fact(rem);
			n=n/10;
		}
		return sum;
		
	}
	int fact(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
	}

}
