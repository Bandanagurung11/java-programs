import java.io.File;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
public class ReadWriteFile
{
public static void main(String[] args)
throws IOException
{
// code for creating file
File f1=new File("file1.txt");
if(!f1.exists())
{
f1.createNewFile();
}
//writing some text into the created file
FileOutputStream fos=new FileOutputStream(f1);
String value="this text is written to the mentioned file for testing purpose";
fos.write(value.getBytes());
fos.flush();
fos.close();

//reading the text from the using fileinput stream;
FileInputStream fis=new FileInputStream(f1);
//System.out.println((char)fis.read());
int n=fis.read();
while(!(n==-1))
{
char c=(char)n;
System.out.print(c);
n=fis.read();
}
fis.close();
}
}