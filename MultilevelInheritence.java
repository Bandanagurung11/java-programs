//multilevel inheritence
class Student
{
void stuDisplay()
{
System.out.println("this is student class method");
}
}
class Second extends Student
{
void show()
{
System.out.println("this is second class method");
}
}
class MultilevelInheritence extends Second
{
void Display()
{
System.out.println("this is sports class method");
}
public static void main(String[] args)
{
Student st1=new Student();
st1.stuDisplay();
Second ob=new Second();
ob.stuDisplay();
ob.show();
MultilevelInheritence ob3=new MultilevelInheritence();
ob3.stuDisplay();
ob3.show();
ob3.Display();
}
}