import java.util.Scanner;
class DataTypes
{
public static void main(String [] args)
{
System.out.println("This is demo of Data Types practice");
byte b1=1;
short s1=1234;
int n1=123456;
long l1=12345678l;
float f1=20.7f;
double d1=12.342343;
boolean bo1=true;
System.out.println(b1);
System.out.println(s1);
System.out.println(n1);
System.out.println(l1);
System.out.println(f1);
System.out.println(d1);
System.out.println(bo1);
Scanner scan=new Scanner(System.in);
System.out.println("enter a byte");
byte b=scan.nextByte();
System.out.println(b+"takes 1 bytes of memory");

System.out.println("enter a short");
short s=scan.nextShort();
System.out.println(s+"takes 2 bytes of memory");

System.out.println("enter an integer");
int n=scan.nextInt();
System.out.println(n+"takes 4 bytes of memory");

System.out.println("enter a long");
long l=scan.nextLong();
System.out.println(l+"takes 8 bytes of memory");

System.out.println("enter a float");
float f=scan.nextFloat();
System.out.println(f+"takes 4 bytes of memory");

System.out.println("enter a double");
double d=scan.nextDouble();
System.out.println(d+"takes 8 bytes of memory");

System.out.println("enter a boolean");
boolean bo=scan.nextBoolean();
System.out.println(bo+"takes 1 bytes of memory");

}
}


