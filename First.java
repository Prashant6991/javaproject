package java8;
import java.io.*;
public class First
{
	public static void main(String args[])
	{
		File f=new File("d:\\FileDemo.java"); 
			if(!f.exists())
			{
				System.out.println("file does not exists");
				
			}
		try(FileInputStream fis=new FileInputStream(f))
		{

		byte b[]=new byte[((int)f.length())];
		fis.read(b);
		String ss=new String(b);
		System.out.println(ss);
		}//asdsad
		catch(Exception ee)
		{
// sushrut is great
			ee.printStackTrace();
		}
	}
}




			