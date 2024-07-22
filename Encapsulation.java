class Encapsulation
{
private int a,b;
void show()
{
System.out.println("sum of number are:"+(a+b));
}
public static void main(String [] args)
{
Encapsulation ob=new Encapsulation();
ob.a=5;
ob.b=6;
ob.show();
}
}