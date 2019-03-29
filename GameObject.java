package driver;

public abstract class GameObject {
	public abstract void draw();
	public abstract void somemethod();
	
	public static void main(String [] args)
	{
		GameObject player = new player();
		player.draw();
		player.somemethod();
		
		
		
		GameObject menu = new menu();
		menu.draw();
		
		
		GameObject [] gameobject = new GameObject[2];
		
		gameobject[0] = player;
		gameobject[1] = menu;
		
		for(int i =0; i < gameobject.length; i++)
		{
		//	gameobject[i].draw();
		}
		
	}
}

