class MethodLocalInnerClass
{
int a=20;
void show()
{
class inner
{
void display()
{
System.out.println("the number is:"+a);
}
}
inner ob=new inner();
ob.display();
}
public static void main(String[] args)
{
MethodLocalInnerClass ob1=new MethodLocalInnerClass();
ob1.show();
}
}