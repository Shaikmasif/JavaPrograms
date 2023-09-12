class Bank
{
private int amount=26250;
int pin=4444;
public void setAmt(int pass,int amt)
{
if(pass==pin)
{
amount=amount+amt;
System.out.println("Successful in setting the amount : "+amt);
}
else
{
System.out.println("entered incorrect password");
System.exit(0);
}
}
public int getAmt(int pass)
{
if(pin!=pass)
{
System.exit(0);
}
return amount;

}
}