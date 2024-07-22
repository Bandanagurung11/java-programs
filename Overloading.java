class Overloading
{
void show(int a, int b)
{
System.out.println("sum of two integer is:"+(a+b));
}
void show(double a, double b)
{
System.out.println("sum of two farction number  is:"+(a+b));
}
public static void main(String[] args)
{
Overloading ob=new Overloading();
ob.show(4,5);
ob.show(4.5,6.5);
}
}