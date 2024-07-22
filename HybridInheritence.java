
class Grandfather
{
void showGrandfather()
{
System.out.println("grandfather method");
}
}
class Father extends Grandfather
{
void showFather()
{
System.out.println("father method");
}
}
class Son extends Father
{
void showSon()
{
System.out.println("son method");
}
}
class HybridInheritence extends Father
{
void showDaughter()
{
System.out.println("daughter methd");
}
public static void main(String[] args)
{
Grandfather ob=new Grandfather();
ob.showGrandfather();
Father ob1=new Father();
ob1.showGrandfather();
ob1.showFather();
Son ob2=new Son();
ob2.showGrandfather();
ob2.showFather();
ob2.showSon();
HybridInheritence ob3=new HybridInheritence();
ob3.showGrandfather();
ob3.showFather();
ob3.showDaughter();
}
}
