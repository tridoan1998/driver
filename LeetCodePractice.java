package driver;
import java.util.*;
import java.io.*;
import java.util.StringTokenizer;  

public class LeetCodePractice{
	
public static int consvertion(String romanword){
	int total = 0;
	
	char [] chars = romanword.toCharArray();

	
	//Take symbol one by one from starting from index 0:
	//If current value of symbol is greater than or equal to the value of next symbol, then add this value to the running total.
	//else subtract this value by adding the value of next symbol to the running total.
	int value1 = 0;
	int value2 = 0;
	for(int i = 0; i < chars.length; i++)
	{
		if(chars[i] == 'I' )
		{
			value1 = 1;
		}
		if(chars[i] == 'V' )
		{
			value1 = 5;
		}
		if(chars[i] == 'X')
		{
			value1 = 10;
		}
		if(chars[i] == 'L' )
		{
			value1 = 50;
		}
		if(chars[i] == 'C')
		{
			value1 = 100;
		}
		if(chars[i] == 'D' )
		{
			value1 = 500;
		}
		if(chars[i] == 'M')
		{
			value1 = 1000;
		}
	}
//check when the words only has one words 
if(chars.length == 1)
{
	if(chars[0] == 'I' )
	{
		total +=1;
	}
	if(chars[0] == 'V' )
	{
		total +=5;
	}
	if(chars[0] == 'X')
	{
		total +=10;
	}
	if(chars[0] == 'L' )
	{
		total +=50;
	}
	if(chars[0] == 'C')
	{
		total +=100;
	}
	if(chars[0] == 'D' )
	{
		total +=500;
	}
	if(chars[0] == 'M')
	{
		total +=1000;
	}
}
else 
{
	if(chars[0] == 'I' )
	{
		total +=1;
	}
	if(chars[0] == 'V' )
	{
		total +=5;
	}
	if(chars[0] == 'X')
	{
		total +=10;
	}
	if(chars[0] == 'L' )
	{
		total +=50;
	}
	if(chars[0] == 'C')
	{
		total +=100;
	}
	if(chars[0] == 'D' )
	{
		total +=500;
	}
	if(chars[0] == 'M')
	{
		System.out.println("here first");
		total +=1000;
	}
	
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
		if(chars[i] == 'I' )
		{
			total +=1;
		}
		if(chars[i] == 'V' )
		{
			total +=5;
		}
		if(chars[i] == 'X')
		{
			total +=10;
		}
		if(chars[i] == 'L' )
		{
			total +=50;
		}
		if(chars[i] == 'C')
		{
			total +=100;
		}
		if(chars[i] == 'D' )
		{
			total +=500;
		}
		if(chars[i] == 'M')
		{
			total +=1000;
		}
		
		if(chars[i] == 'V')
		{
			if(chars[i-1] == 'I')
			{
				System.out.println("here fifth");
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
			else 
			{
				total += 10;
			}
		}
		else if(chars[i] == 'L')
		{
			if(chars[i-1] == 'X')
			{
				total += 40;
			}
			else 
			{
				total += 50;
			}
		}
		else if(chars[i] == 'C')
		{
			if(chars[i-1] == 'X')
			{
				System.out.println("here four");
				total += 90;
			}
			else 
			{
				System.out.println("here second");
				total += 100;
			}
		}
		else if(chars[i] == 'D')
		{
			if(chars[i-1] == 'C')
			{
				total += 400;
			}
			else 
			{	
				total += 500;
			}
		}
		else if(chars[i] == 'M')
		{
			if(chars[i-1] == 'C')
			{
				System.out.println("here third");
				total += 900;
			}
			else
			{
				total += 1000;	
			}
		}
	}
}
	return total;
}
public static void main(String [] Args ){
	int x = 0;
	while(x < 5)
	{
	Scanner input = new Scanner(System.in);
	System.out.printf("Enter a number: ");
	String string = input.nextLine();
	System.out.println(consvertion(string));
	x++;	
	}
}
}