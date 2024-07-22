//single inheritence
class BaseClass
{
void show()
{
System.out.println("iam in a base class");
}
}
class SingleInheritence extends BaseClass
{
void derieved()
{
System.out.println("iam in a derived class");
}
public static void main(String[] args)
{
SingleInheritence ob=new SingleInheritence();
ob.show();
ob.derieved();
BaseClass ob2=new BaseClass();
ob2.show();
}
} 