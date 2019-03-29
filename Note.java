package driver;
//Association: passing an object by reference to a method. 
//This creates a temporary relationship between two objects which is referred to association.
//Containment: when an object (an instance variable) is created with outer object creation.

public class Note {
	private int pages;
	private String subject;
	Note()
	{
		
	}
	Note(int i, String s)
	{
		pages =i;
		subject  = s;
	}
	public void setPages(int n)
	{
		pages = n;
	}
	
	public int getPages()
	{
		return pages;
	}
	
	public void setSubject(String n)
	{
		subject = n;
	}
	
	public String getSubject()
	{
		return subject;
	}
	
	public void print()
	{
		System.out.println(pages);
		System.out.println(subject);
	}
	public static void main(String[] args)   
	{
		Note [] N = new Note[3];
		for(int i = 0; i < N.length; i++)
		{
			N[i] = new Note();
		}
		
		N[1].setPages(10);
		N[1].setSubject("Math");
		N[1].print();
	}
	
	
	
		
}
