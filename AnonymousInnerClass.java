class AnonymousInnerClass
{
void show()
{
System.out.println("show method");
}
public static void main(String[] args)
{
AnonymousInnerClass ob=new AnonymousInnerClass()
{
void show()
{
System.out.println("this is inner class method");
}
};
ob.show();
}
}