//hierarchical inheritence
class First
{
void show()
{
System.out.println("this is first class method:");
}
}
class Second extends First
{
void display()
{
System.out.println("this is secod class method");
}
}
class HierarchicalInheritence extends First
{
void shows()
{
System.out.println("this is final class method");
}
public static void main(String[] args)
{
First ob=new First();
ob.show();
Second ob2=new Second();
ob.show();
ob2.display();
HierarchicalInheritence ob3=new HierarchicalInheritence();
ob3.show();
ob3.shows();
}
}