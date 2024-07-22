interface InterfaceA
{
void show();
}
interface InterfaceB
{
void display();
}
class FirstInterface implements InterfaceA, InterfaceB
{
public void show()
{
System.out.println("this is show method");
}
public void display()
{
System.out.println("this is display method");
}
public static void main(String [] args)
{
FirstInterface ob=new FirstInterface();
ob.show();
ob.display();
InterfaceA ob2=new FirstInterface();
ob2.show();
InterfaceB ob3=new FirstInterface();
ob3.display();
}
}