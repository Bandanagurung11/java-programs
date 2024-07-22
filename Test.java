class Test extends Thread
{
public void run()
{
try
{
for(int i=0; i<=5; i++)
{
System.out.println(i);
Thread.sleep(2000);
}
}
catch (Exception e)
{
System.out.println(e);
}
}
public static void main(String[] args)
{
Test ob=new Test();
ob.start();
//ob.interrupt();
}
}