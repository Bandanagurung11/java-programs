//geter and selter method
class Abc
{
private String name;
private int id;
public String getName()
{
return name;
}
public void setName(String a)
{
name=a;
}
public int getId()
{
return id;
}
public void setId(int b)
{
id=b;
}
}
public class GeterSelter
{
public static void main(String[] args)
{
Abc e1=new Abc();
e1.setName("krishna");
e1.setId(102);
System.out.println("employee name is"+e1.getName());
System.out.println("employee id"+e1.getId());
}
}
