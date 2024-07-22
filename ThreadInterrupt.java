 class ThreadInterrupt extends Thread
{
public void run()
{
for(int i=0; i<=5; i++)
{
try
{
System.out.println(i);
Thread.sleep(2000);
}
catch (Exception e)
{
System.out.println(e);
}
}
}
public static void main(String[] args)
{
ThreadInterrupt ob=new ThreadInterrupt();
ob.start();
ob.interrupt();
}
}