//extending thread class
class ThreadDemo extends Thread
{
public void run()
{
for(int i=0; i<=10; i++)
{
System.out.println("child thread");
}
}
}
class MyThread extends Thread
{
public static void main(String[] args)
{
MyThread t=new MyThread();
t.start();
for(int i=0; i<=10; i++)
{
System.out.println("main thread");
}
}
}