import java.util.Random;
public class RoundScoreDisplay implements Observer{

	private Subject golfer;
	private int strokesTotal;
	private int parTotal;
	
	public RoundScoreDisplay(Subject golfer) {
		this.golfer=golfer;
		golfer.registerObserver(this);
	}
	public void update(int strokes, int par) {
		this.strokesTotal=strokesTotal;
		this.parTotal=parTotal;
		displayRoundScore();
	}
	public void displayRoundScore() {
		System.out.print("Current Hole stats");
		
		System.out.println(" Par: (cumulative par) "+ parTotal + "/nStrokes: (cumulative strokes) " + strokesTotal);
		
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