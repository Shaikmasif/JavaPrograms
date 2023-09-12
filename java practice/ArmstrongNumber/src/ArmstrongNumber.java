
public class ArmstrongNumber {
	int checkArmstrong(int n)
	{
		ArmstrongNumber an=new ArmstrongNumber();
		int power=an.countDigits(n);
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			sum=sum+sumPowers(rem,power);
			n=n/10;
		}
		
		return sum;
	}
	int sumPowers(int n,int power)
	{
		int sum=1;
		for(int i=1;i<=power;i++)
		{
			sum=sum*n;
		}
		return sum;
	}
	int countDigits(int n)
	{
		int count=0;
		while(n>0)
		{
			int rem=n%10;
			count++;
			n=n/10;
		}
		return count;
	}

}
