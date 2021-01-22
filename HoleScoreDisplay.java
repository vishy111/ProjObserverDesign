	/**
	 * 
	 * @author vishalkosaraju
	 *
	 */
public class HoleScoreDisplay implements Observer{

	/**
	 * Subject is golfer and is a private variable
	 * Has two other private variables for strokes and par
	 */
	private Subject golfer;
	private int strokes;
	private int par;
	/**
	 * One of our observers are the hole score displays 
	 * @param golfer Subject golfer is passed through. 
	 */
	public HoleScoreDisplay(Subject golfer) {
		this.golfer=golfer;
		golfer.registerObserver(this);
	}
	/**
	 * This method updates the strokes, and pars
	 * @param strokes and par pass through
	 */
	public void update(int strokes, int par) {
		this.strokes=strokes;
		this.par=par;
		displayCurrentScore();
	}
	/**
	 * This displays the score and appends statements as well using the difference
	 */
	public void displayCurrentScore() {
		System.out.print("\nCurrent Hole stats");
		
		System.out.println(" \nPar: "+ par + "\nStrokes: " + strokes);
		
		int diff =0;
		diff = par - strokes;
		if(diff==0)
			System.out.println("Made par");
		else if(diff < 0)
			System.out.println(Math.abs(diff) + " over par");
		else if(diff>0)
			System.out.println(diff + " under par");		
		
	}
}
