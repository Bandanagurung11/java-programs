class base
{
void show()
{
System.out.println("this is base class method");
}
}
class MethodOverriding extends base
{
void show()
{
System.out.println("this is derieved class method:");
}
public static void main(String[] args)
{
base ob=new base();
ob.show();
MethodOverriding ob2=new MethodOverriding();
ob2.show();
}
}