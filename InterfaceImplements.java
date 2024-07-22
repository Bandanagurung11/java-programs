interface interfaceA
{
void show();
}
class classA implements interfaceA
{
public void show()
{
System.out.println("this is show method");
}
}
class InterfaceImplements implements interfaceA
{
public void show()
{
System.out.println("this is second class show method");
}
public static void main(String[] args)
{
classA ob=new classA();
ob.show();
InterfaceImplements ob2=new InterfaceImplements();
ob2.show();
}
}
