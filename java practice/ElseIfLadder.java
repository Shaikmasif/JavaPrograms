import java.util.Scanner;
class ElseIfLadder
{
public static void main(String [] args)
{
System.out.println("This is demo of else if/if else ladder");
Scanner scan=new Scanner(System.in);
System.out.println("enter the number between 1 to 4");
int n=scan.nextInt();
if(n==1)
{
System.out.println("you have pressed 1");
}
else if(n==2)
{
System.out.println("you have pressed 2");
}
else if(n==3)
{
System.out.println("you have pressed 3");
}
else if(n==4)
{
System.out.println("you have pressed 4");
}
else
{
System.out.println("YOU DIDN'T FOLLOW THE RULE");
}
}
}