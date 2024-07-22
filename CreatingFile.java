import java.io.*;
class CreatingFile
{
public static void main(String[] args)
throws Exception
{
// to create file
/*File f1= new File("abc.txt");
System.out.println(f1.exists());
f1.createNewFile();
System.out.println(f1.exists());*/

//to create directory 
File f2=new File("xyz");
System.out.println(f2.exists());
f2.mkdir();
System.out.println(f2.exists());
}
}