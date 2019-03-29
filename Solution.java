package driver;

import java.util.*;
public class Solution {
	public static void main(String[] args) {

	System.out.println("Result: ");
	int y = 10;
	int x = y;
	y = x * 3;
	System.out.println(y);
    
	}

	
	//Question #1 Two Sum (easy mode)   	
    public int[] twoSum(int[] nums, int target)
	{
		int [] result = new int [2];
		
		int sum;
		for(int i = 0; i < nums.length;i++)
		{
			for(int j = i+1; j < nums.length;j++)
			{
				sum = 0;
				sum = nums[i]+nums[j];
				if(sum == 9)
				{
					result[0] = i;
					result[1] = j;
				}
			}
		}
    	return result;
	}
    
    //Quesiton #7 Reverse Integer (easy mode)
    //Given a 32-bit signed integer, reverse digits of an integer.
    public static int Reverse(int integer)
    {
       	int result = 0;
    	int copy_of_integer = integer; 
    	//get how many digits in the integer 
    	int digit_of_integer = 0;

    	while(integer > 0)
    	{
    		integer /= 10;
    		digit_of_integer++;
    	}
    	
    int position_of_digit = 1;
    for(int i = 1; i < digit_of_integer; i++)
    {
    	position_of_digit *= 10; 
    }
    
    int hold_digit_cutted_out = 0;
	//cut out all the digits of the integer
	//and add it to times_10 and time 10 to times_10 till we divide all digit in the integer
    for(int i =0; i < digit_of_integer; i++)
    {
    	//get the last digit in the integer
    	hold_digit_cutted_out = copy_of_integer%10;
    	
    	result += hold_digit_cutted_out*position_of_digit;
    	position_of_digit /= 10;
    	copy_of_integer /= 10;
    }
    	return result;
    			
    }

//    Question #9 Palindrome Number (easy mode)
//    Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
    public static boolean PalindromeNumber(int thenumber)
    {
    	boolean ispalindrimeNumber = false;
    	int copy_of_the_number = thenumber;
    	int another_copy_of_the_number = thenumber;
    	
    	//find how many digits in the number
    	int digit_of_the_number = 0;
    	while(copy_of_the_number > 0)
    	{
    		copy_of_the_number /= 10;
    		digit_of_the_number++;

    	}
    	
    	int times_10 = 1;
    	for(int i =1; i < digit_of_the_number;i++)
    	{
    		times_10 *= 10;
    	}
    	
    	int reversed_number = 0;
    	int temp = 0;
    	for(int i =0; i < digit_of_the_number;i++)
    	{
    		temp = thenumber%10;
    		reversed_number += temp*times_10;
    		times_10 /= 10;
    		thenumber /= 10;
    	}
    	if(reversed_number == another_copy_of_the_number)
    	{
    		ispalindrimeNumber = true;
    	}
    	return ispalindrimeNumber;
    }

	//CodeWar problem 
	public static int NoEndingWithZero(int number)
	{
		if(number == 0)
		{
			return -1;
		}
		else if(number%10 == 0)
		{
			int HoldLastDigit = 0;
		    while(number%10 == 0)
		    {
		    	HoldLastDigit = number%10;
		    	number /= 10;
		    }
			return number;	
		}
	
		else 
		{
			return number;
		}
	}
}

//		Question #13 easy mode 
//		
