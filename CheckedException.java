import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
class ReadWrite
{
void readFile() throws FileNotFoundException
{
FileInputStream fi=new FileInputStream("e:/file.txt");
}
}
class CheckedException
{
public static void main(String[] args)
{
ReadWrite rw=new ReadWrite();
try
{
rw.readFile();
}
catch(FileNotFoundException e)
{
System.out.println(e);
}
}
}