import java.util.Random;
	/**
	 * 
	 * @author vishalkosaraju
	 *
	 */
public class RoundScoreDisplay implements Observer{

	/**
	 * Subject is golfer and is a private variable
	 * Has two other private variables for strokes and par
	 */
	private Subject golfer;
	private int strokesTotal;
	private int parTotal;
	
	/**
	 * One of our observers are the hole score displays 
	 * @param golfer Subject golfer is passed through. 
	 */
	public RoundScoreDisplay(Subject golfer) {
		this.golfer=golfer;
		golfer.registerObserver(this);
	}
	/**
	 * This method updates the strokesTotal, and parTotal
	 * @param values strokesTotal and parTotal pass through
	 */
	public void update(int strokesTotal, int parTotal) {
		this.strokesTotal=strokesTotal;
		this.parTotal=parTotal;
		displayRoundScore();
	}
	/**
	 * This displays the score and appends statements as well
	 */
	public void displayRoundScore() {
		System.out.print("\nCurrent Hole stats ");
		
		System.out.println(" \nPar: "+ parTotal + "\nStrokes:  " + strokesTotal);
	
		int diff =0;
		diff = parTotal - strokesTotal;
		if(diff==0)
			System.out.println("Made par");
		else if(diff < 0)
			System.out.println(Math.abs(diff) + " over par");
		else if(diff>0)
			System.out.println(diff + " under par");
	}
}