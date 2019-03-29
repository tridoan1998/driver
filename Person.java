package driver;
import java.io.*;

public class Person implements Serializable{
	String name;

	public Person(String n)
	{
		this.name = n;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}


	
	
}
