package driver;

import java.io.*;
import java.util.*;

public class Util{
	public void readfile(String filename)
	{
		try {
		FileReader file = new FileReader(filename);
		BufferedReader buff = new BufferedReader(file);
		boolean eof = false;
		String line = null;
		while(!eof)
		{
			
			line = buff.readLine();
			if(line == null)
			{
				eof = true;
			}
			else
			{
				System.out.println(line);
			}
		}
		buff.close();
		}catch(IOException e)
		{
			System.out.println(e.toString());
		}
		
		
	}
}