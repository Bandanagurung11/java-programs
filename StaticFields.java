class Test
{
static int x=2;
static int y=0;
}
public class StaticFields
{
public static void main(String[] args)
{
Test t1=new Test();
Test t2=new Test();
t1.y++;
t2.y++;
System.out.println(t1.y);
System.out.println(t2.y);
Test.x++;
Test.x++;
System.out.println(Test.x);
System.out.println(Test.x);
}
}