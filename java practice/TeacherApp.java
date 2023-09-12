class Teacher
{
String name;
String sub;
int sal;
void teach()
{
System.out.println(name+"teaches");
}
Teacher(String name,String sub,int sal)
{
this.name=name;
this.sub=sub;
this.sal=sal;
}
}
class TeacherApp
{
public static void main(String[]args)
{
Teacher t1=new Teacher("deep","java",25000);
Teacher t2=new Teacher("suresh","aptitude",30000);
System.out.println(t1.name+t1.sub+t1.sal);
t1.teach();
System.out.println(t2.name+t2.sub+t2.sal);
t2.teach();
}
}