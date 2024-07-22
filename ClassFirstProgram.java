//simple program of creating class and object in java
class ClassFirstProgram
{
void show()
{
System.out.println("iam in a show method");
}
void run()
{
System.out.println("iam in a run method");
}
public static void main(String[] args)
{
System.out.println(" iam in a main method");
ClassFirstProgram ob=new ClassFirstProgram();
ob.show();
ob.run();
}
}

