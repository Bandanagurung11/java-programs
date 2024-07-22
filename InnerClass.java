class InnerClass
{
class inner
{
void show()
{
System.out.println("this is inner class method");
}
}
void display()
{
System.out.println("this is outer class method");
}
public static void main(String[] args)
{
InnerClass ob=new InnerClass();
ob.display();
InnerClass.inner ob1=ob.new inner();
ob1.show();
}
}