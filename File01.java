package package01;

import java.io.*;

public class File01 
{	
	public static void main(String[] args) throws IOException //copy data between files
	{		
		File inputFile = new File("E:\\Wolf's Lair\\Source.txt");
		File outputFile = new File("E:\\Wolf's Lair\\Target.txt");
		
		FileReader in = new FileReader(inputFile);
		FileWriter out = new FileWriter(outputFile);
		
		int c;
		while((c = in.read()) != -1)
		{
			out.write(c);
			System.out.print((char)c);
		}
		
		in.close();
		out.close();
	}
}