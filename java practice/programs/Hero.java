
class Hero
{
public static void main(String []args)
{
int pass=4444;
Bank b=new Bank();
b.setAmt(pass,8750);
int balance=b.getAmt(pass);
System.out.println("Now the total available balance : "+balance);
}
}

