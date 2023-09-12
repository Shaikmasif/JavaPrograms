class Car
{
String brand;
String color;
String model;
int price;
void accelerate()
{
System.out.println("car is in on mode");
}
}
class CarApp
{
public static void main(String [] args)
{
Car c=new Car();
c.brand="Mahindra";
c.color="Black";
c.price=1800000;
c.model="Thar";
System.out.println("Brand:"+c.brand);
System.out.println("color:"+c.color);
System.out.println("model:"+c.model);
System.out.println("price:"+c.price);
c.accelerate();
}
}