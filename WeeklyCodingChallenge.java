package driver;
import java.util.*;


public class WeeklyCodingChallenge {
/*
Write a function, gooseFilter/goose_filter/GooseFilter, that takes an array of strings as an argument and returns
 a filtered array containing the same elements but with the 'geese' removed.

The geese are any strings in the following array, which is pre-populated in your solution:

geese = ["African", "Roman Tufted", "Toulouse", "Pilgrim", 
"Steinbacher"] 
For example, if this array were passed as an argument:

["Mallard", "Hook Bill", "African", "Crested", "Pilgrim",
"Toulouse", "Blue Swedish"] 
Your function would return the following array:

["Mallard", "Hook Bill", "Crested", "Blue Swedish"] 
The elements in the returned array should be in the same order as in the initial array passed to your function,
 albeit with the 'geese' removed. Note that all of the strings will be in the same case as those provided, and some elements may be repeated.
*/
	public ArrayList<String> gooseFilter(String [] stringarray)
	{	
		ArrayList<String> newlist = new ArrayList<String>();
		
		for(int i =0; i < stringarray.length; i++)
		{
			newlist.add(stringarray[i]);
		}
		
		String [] geese = {"African", "Roman Tufted", "Toulouse", "Pilgrim", "Steinbacher"};
		
		for(int i = 0; i < geese.length; i++)
		{
			for(int j = 0 ; j < newlist.size(); j++)
			{
				if(geese[i] == newlist.get(j))
				{
					newlist.remove(j);
				}
			}
		}

		return newlist;
	}
	
	
	/*
Your task is to find which diagonal is "larger": which diagonal has a bigger sum of their elements.

If the principal diagonal is larger, return "Principal Diagonal win!"
If the secondary diagonal is larger, return "Secondary Diagonal win!"
If they are equal, return "Draw!"
	 */

	
	
	/*
	 * 
	 */
	
	
	
	
	public static void main(String[] args) {
		WeeklyCodingChallenge program = new WeeklyCodingChallenge();
		String [] geese = {"Mallard", "Hook Bill", "African", "Crested", "Pilgrim", "Toulouse", "Blue Swedish"};
		ArrayList<String> result = program.gooseFilter(geese);
		for(int i = 0; i < result.size(); i++)
			System.out.println(result.get(i));
	}

}
