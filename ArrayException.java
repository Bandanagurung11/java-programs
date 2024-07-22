class ArrayException
{
public static void main(String[] args)
{
try
{
int arr[]={30,90,75,53,89};
System.out.println("it is main method");
System.out.println(arr[3]);
System.out.println(arr[7]);
System.out.println(arr[2]);
}
catch(Exception e)
{
System.out.println(e);
}
finally
{
System.out.println("this is finally block executed");
}
System.out.println("main method ended");
}
}
