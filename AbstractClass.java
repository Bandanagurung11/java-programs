abstract class vechile
{
abstract void start();
}
class car extends vechile
{
void start()
{
System.out.println("car start with key");
}
}
class AbstractClass extends vechile
{
void start()
{
System.out.println("scooter start with kick");
}
public static void main(String[] args)
{
vechile v=new car();
v.start();
car c=new car();
c.start();
vechile v1=new AbstractClass();
v1.start();
AbstractClass s=new AbstractClass();
s.start();
}
}
