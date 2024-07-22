class outer
{
public static class inner
{
public void show()
{
System.out.println("this is inner class method");
}
}
}
public class StaticNestedInnerClass
{
public static void main(String[] args)
{
outer.inner ob=new outer.inner();
ob.show();
}
}