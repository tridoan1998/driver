package driver;
import java.util.*;
import java.io.*;
import java.util.StringTokenizer;  

public class LeetCodePractice{
	
public static int consvertion(String romanword){
	int total = 0;
	
	char [] chars = romanword.toCharArray();

		if(chars[0] == 'I' && chars[1] == 'I')
		{
			total +=1;
		}
		if(chars[0] == 'V' && chars[1] == 'V')
		{
			total +=5;
		}
		if(chars[0] == 'X' && chars[1] == 'X')
		{
			total +=10;
		}
		if(chars[0] == 'L' && chars[1] == 'L')
		{
			total +=50;
		}
		if(chars[0] == 'C' && chars[1] == 'C')
		{
			total +=100;
		}
		if(chars[0] == 'D' && chars[1] == 'D')
		{
			total +=500;
		}
		if(chars[0] == 'M' && chars[1] == 'M')
		{
			total +=1000;
		}
	for(int i = 1; i < chars.length; i++)
	{
		if(chars[i] == 'I')
		{
			total +=1;
		}
		else if(chars[i] == 'V')
		{
			if(chars[i-1] == 'I')
			{
				total +=4;
			}
			else
			{
				total +=5;
			}
		}
		else if(chars[i] == 'X')
		{
			if(chars[i-1] == 'I')
			{
				total +=9;
			}
			total += 10;
		}
		else if(chars[i] == 'L')
		{
			if(chars[i-1] == 'X')
			{
				total += 40;
			}
			total += 50;
		}
		else if(chars[i] == 'C')
		{
			if(chars[i-1] == 'X')
			{
				total += 90;
			}
			total += 100;
		}
		else if(chars[i] == 'D')
		{
			if(chars[i-1] == 'C')
			{
				total += 400;
			}
			total += 500;
		}
		else if(chars[i] == 'M')
		{
			if(chars[i-1] == 'C')
			{
				total += 900;
			}
			total += 1000;
		}
	}
	
	return total;
}
public static void main(String [] Args ){
	System.out.println(consvertion("IV"));
	
	


}
}