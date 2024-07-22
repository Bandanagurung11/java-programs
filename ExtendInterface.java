import java.util.Scanner;
interface simple
{
void add(int a,int b);
void diff(int a,int b);
}
interface advance extends simple
{
void prod(int a,int b);
void div(int a,int b);
}
class All implements advance
{
public void add(int a,int b)
{
System.out.println("the sum is:"+(a+b));
}
public void prod(int a,int b)
{
System.out.println("the product is:"+a*b);
}
public void diff(int a,int b)
{
    System.out.println("the difference is:"+ (a-b));
}
public void div(int a, int b)
{
    System.out.println("the division to the number are :"+ (a/b));
}
}
class ExtendInterface
{
public static void main(String [] args)
{
Scanner Sc =new Scanner(System.in);
int x,y;
System.out.println("enter two number");
x=Sc.nextInt();
y=Sc.nextInt();
advance ob=new All();
ob.add(x,y);
ob.prod(x,y);
}
}