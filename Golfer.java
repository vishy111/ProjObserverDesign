import java.util.ArrayList;

public class Golfer implements Subject{
	private String name= "";
	private ArrayList<Observer> observers;
	private int strokes;
	private int par;

	/**
	 * An array list of observers are made
	 */
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
	/**
	 * Constructor with string name type that passes through
	 * @param name of String type that refers to the name of the golfer
	 */
	public Golfer(String name) {
		this.name=name;
			observers = new ArrayList<Observer>();	
		//notifyObservers(strokes , par);
	}
	/**
	 * This will remove an observer
	 */
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}
	/**
	 * 
	 * @param int strokes will pass through so it can be sent to the observer
	 * @param int par will pass through so it can be sent to the observer
	 */
	public void enterScore(int strokes,int par) {
		this.strokes=strokes;
		this.par=par;
		notifyObservers(strokes,par);
	}
	/**
	 * This method will loop through the observers and update the strokes and pars
	 */
	
	public void notifyObservers(int strokes, int par) {
		for(Observer observer : observers) {
			observer.update(strokes, par);
		}
	}
	/**
	 * This is a get method for Name
	 * @return name to be retreived
	 */
	public String getName() {
		return name;
	}
	
}

