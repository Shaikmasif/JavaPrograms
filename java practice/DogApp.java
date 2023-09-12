class Dog
{
String name;
String color;
String breed;
void bark()
{
System.out.println("Bow Bow!");
}
}
class DogApp
{
public static void main(String[]args)
{
Dog d1=new Dog();
d1.name="flash";
d1.color="gold";
d1.breed="pitbull";
Dog d2=new Dog();
d2.name="tom";
d2.color="black";
d2.breed="husky";
System.out.println("Detalis of dog D1:");
System.out.println("name:"+d1.name);
System.out.println("color:"+d1.color);
System.out.println("breed:"+d1.breed);
d1.bark();
System.out.println();
System.out.println("Detalis of dog D2:");
System.out.println("name:"+d2.name);
System.out.println("color:"+d1.color);
System.out.println("breed:"+d1.breed);
d2.bark();
}
}