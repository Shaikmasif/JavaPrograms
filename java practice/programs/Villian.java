class Villian
{
public static void main(String []args)
{
int pass=0000;
Bank b=new Bank();
b.setAmt(pass,10000);
int balance=b.getAmt(pass);
System.out.println("Now the total available balance : "+balance);
}
}