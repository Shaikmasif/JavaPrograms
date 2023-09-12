package printing;

public class Calculator {
	public static void add(byte a,byte b)
	{
		System.out.println("Addition Result :"+(a+b));
	}
	public static void add(int a,int b,int c)
	{
		System.out.println("Addition Result : "+(a+b+c));
	}
	public static void sub(int a,int b)
	{
		System.out.println("Subtraction Result : "+(b-a));
	}
	public static void sub(int a,int b,int c)
	{
		System.out.println("Subtraction Result : "+(a-b-c));
	}
	public static void mul(int a,int b)
	{
		System.out.println("Multiplication Result : "+(a*b));
	}
	public static void mul(int a,int b,int c)
	{
		System.out.println("Multiplication Result : "+(a*b*c));
	}
	public static void div(int a,int b)
	{
		System.out.println("Division Result : "+(b/a));
	}
}
