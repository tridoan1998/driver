package driver;
public class Student {
	private int SID;
	private int [] scores = new int[5];
	
	Student(int SID, int [] scores)
	{
		this.SID = SID;
		this.scores = scores;
	}

	public int getSID() {
		return SID;
	}

	public void setSID(int sID) {
		SID = sID;
	}

	public int[] getScores() {
		return scores;
	}

	public void setScores(int[] scores) {
		this.scores = scores;
	}
	
	
	
}
