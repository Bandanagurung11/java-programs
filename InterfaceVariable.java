//acessing interface variable
interface somevalue
{
int x=35,y=57;
}
class add implements somevalue
{
void sum()
{
System.out.println("sum is :"+(x+y));
}
}
class sub implements somevalue
{
void display()
{
System.out.println("numbers are:"+x+" "+y);
}
void diff()
{
int a=x,b=y;
int res=a-b;
System.out.println("difference is:"+res);
}
}
class InterfaceVariable
{
public static void main(String[] args)
{
add ob=new add();
ob.sum();
sub ob2=new sub();
ob2.display();
ob2.diff();
}
}