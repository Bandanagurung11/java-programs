import java.util.Scanner;
class ObjtInitialize2
{
int a,b;
/*void referenceMethod()
{
System.out.println("the difference is:"+(a-b));
}
void get(int a,int b)
{
this.a=a;
this.b=b;
System.out.println(" difference :"+(a-b));
}*/
public ObjtInitialize2(int c, int d)
{
a=c;
b=d;
System.out.println("the difference is:"+(a-b));
}
public static void main(String[] agrs)
{
Scanner Sc =new Scanner(System.in);
/*System.out.println("enter two number");
ObjtInitialize2 ob=new ObjtInitialize2();
ob.a=sc.nextInt();
ob.b=sc.nextInt();
ob.referenceMethod();
ObjtInitialize2 ob1=new ObjtInitialize2();
System.out.println("again enter two number for using method way");
int x=sc.nextInt();
int y=sc.nextInt();
ob1.get(x,y);*/
System.out.println("enter two number for constructor method");
int j=Sc.nextInt();
int k=Sc.nextInt();
ObjtInitialize2 e1 =new ObjtInitialize2(j,k);
}
}
