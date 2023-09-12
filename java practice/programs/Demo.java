import java.util.Scanner;
class Demo
{
public static void main(String []args)
{
Scanner scan=new Scanner(System.in);
System.out.println("enter the values");
int a=scan.nextInt();
int b=scan.nextInt();
int result=Sum.sum(a,b);//method call
System.out.println("sum is "+result);
}
}

