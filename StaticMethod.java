//crating static method,when we use static keyword right before the method, we can access this mthod without creating an object
class StaticMethod
{
static void show()
{
System.out.println("iam in a show method");
}
 static void run()
{
System.out.println("iam in a run method");
}
public static void main(String[] args)
{
System.out.println("iam in a main method");
show();
run();
}
}