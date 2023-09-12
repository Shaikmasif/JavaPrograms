import java.util.Scanner;
class SwitchDemo
{
public static void main(String [] args)
{
System.out.println("switch demo");
Scanner scan=new Scanner(System.in);
System.out.println("type the number 1-4 on keyboard");
int n=scan.nextInt();
switch(n)
{
case 1:
System.out.println("you have typed 1");
break;
case 2:
System.out.println("you have typed 2");
break;
case 3:
System.out.println("you have typed 3");
break;
case 4:
System.out.println("you have typed 4");
break;
default:
System.out.println("read the message properly");
}
}
}


