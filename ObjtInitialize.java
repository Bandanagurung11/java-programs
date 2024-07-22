// object initialize
// by using reference
/*class ObjtInitialize
{
int a,b;
public static void main(String[] args)
{
ObjtInitialize ob=new ObjtInitialize();
ob.a=20;
ob.b=30;
System.out.println(ob.a+" "+ob.b);
}
}*/

//by using method
/*class Method
{
int a,b;
void get(int c, int d)
{
a=c;
b=d;
}
void show()
{
System.out.println(a+" "+b);
}
public static void main(String[] args)
{
Method ob=new Method();
ob.get(22,24);
ob.show();
}
}*/

//by using contructor
class Constructor
{
int a,b;
 Constructor(int a, int b)
{
this.a=a;
this.b=b;
}
void show()
{
System.out.println(a+" "+b);
}
public static void main(String[] args)
{
Constructor ob=new Constructor(12,23);
Constructor ob2=new Constructor(30,28);
ob.show();
ob2.show();
}
}