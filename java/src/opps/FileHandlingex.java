package opps;
import java.io.*;

public class FileHandlingex
{

	public static void main(String[] args) throws IOException
	{
		PrintWriter pw=new PrintWriter("D://PDF.pdf");
		pw.print("Hello world");
		pw.println(100);
		pw.println("hello");
		pw.println("hemanth2");
		pw.close();
	}
}
