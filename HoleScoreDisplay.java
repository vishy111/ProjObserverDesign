import java.util.Random;
public class HoleScoreDisplay implements Observer{

	private Subject golfer;
	private int strokes;
	private int par;
	
	public HoleScoreDisplay(Subject golfer) {
		this.golfer=golfer;
		golfer.registerObserver(this);
	}
	public void update(int strokes, int par) {
		this.strokes=strokes;
		this.par=par;
		displayCurrentScore();
	}
	public void displayCurrentScore() {
		System.out.print("Current Hole stats");
		
		System.out.println(" Par: (par for this hole) "+ par + "/nStrokes: (golfers strokes for this hole) " + strokes);
		
		Random rand=new Random();
		int choice=rand.nextInt(3);
		if(choice== 0)
		
			System.out.println(" Made par");
		
		else if(choice == 1)
		
			System.out.println(" x under par");
		
		else if (choice == 2)
		
			System.out.println(" x over par");
	}
}
