import java.util.Scanner;
class IfDemo
{
public static void main(String [] args)
{
System.out.println("This is demo for if conditional control construct");
Scanner scan=new Scanner(System.in);
System.out.println("enter 1 from keyboard");
int n=scan.nextInt();
if(n==1)
{
System.out.println("you are all set");
}
System.out.println("you haven't pressed 1");
}
}