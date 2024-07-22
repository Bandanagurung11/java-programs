class MultipleTryCatch
{
public static void main(String[] args)
{
System.out.println("this is main method");
int arr[]={1,2,3,4,5,6};
//int bc[]={12,34,56,78};
try
{
System.out.println(arr[2]);
System.out.println(arr[6]);
}
catch(Exception a)
{
System.out.println(a);
}
try
{
System.out.println(arr[3]);
System.out.println(arr[7]);
System.out.println(arr[4]);
}
catch(Exception e)
{
System.out.println(e);
}
finally
{
System.out.println("this is clean up code");
}
System.out.println("main method ended");
}
}