package driver;
public class Linklist {

public String toString()
{
	String result = "";
	Node temp = head;
	while(temp != tail)
	{
		result += temp.data;
		temp = temp.linknext;
	}
	result += "\n";
	return result;
}

	private class Node {
		private int data;
		private Node linknext;
		public Node(int d)
		{
			this.data = d;
			this.linknext  = null;
		}
		public void setData(int d)
		{
			this.data = d;
		}
		public int getData()
		{
			return data;
		}	
	}
	
	private Node head;
	private Node tail;
	private int size;
	

	public int getSize()
	{
		return size;
	}
	

public void insertEnd(int newdata)
{
	if(getSize() == 0)
	{
		Node n = new Node(newdata);
		head = tail = n;
		size++;
	}
	else 
	{
		Node n = new Node(newdata);		
		tail.linknext= n;
		tail = n;
		size++;
	}
}

public void insertStart(int newdata)
{
	if(getSize() == 0)
	{
		Node n = new Node(newdata);
		head = tail = n;
		size++;
	}
	else
	{
		Node n = new Node(newdata);
		n.linknext = head;
		head = n;		
		size++;
	}
}

public void removeStart()
{
	if(getSize() == 0)
	{
		System.out.println("The list is empty!");
	}
	else if(getSize() == 1)
	{
		head = tail = null;
		size--;
	}
	else 
	{
		Node temp = head;
		head = head.linknext;
		temp = null;
		size--;
	}
}

public void removeEnd()
{
	if(getSize() == 0)
	{
		System.out.println("The list is empty!");
	}
	else if(getSize() == 1)
	{
		head = tail = null;
		size--;
	}
	else 
	{
		Node temp = head;
		while(temp.linknext != tail)
		{
			temp = temp.linknext;
		}
		tail = temp;
		temp = tail.linknext = null;
	}
}

public void print()
{
	if(getSize() == 0)
	{
		System.out.println("The list is empty!");
	}
	else 
	{
		Node temp = head;
		while(temp != null)
		{
			System.out.println(temp.data);
			temp = temp.linknext;
		}
	}
}

public boolean isEmpty()
{
	return size == 0;
}
public static void main(String [] args){
	Linklist List = new Linklist();
	System.out.printf("%s", List);
	List.insertEnd(5);
	List.insertEnd(2);
	List.insertEnd(3);
	
	List.insertStart(10);
	List.insertStart(20);
	
	List.removeStart();
	List.removeEnd();
	//List.print();
	System.out.printf("%s", List);
	
}

}