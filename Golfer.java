import java.util.ArrayList;

public class Golfer implements Subject{
	private String name= "";
	private ArrayList<Observer> observers;
	private int strokes;
	private int par;

	public Golfer() {
		observers = new ArrayList<Observer>();
	}
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
	public Golfer(String name) {
		this.name=name;
		//notifyObservers();
	}
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}
	public void enterScore(int strokes,int par) {
		this.strokes=strokes;
		this.par=par;
		notifyObservers(strokes,par);
	}
	public void notifyObservers(int strokes, int par) {
		for(Observer observer : observers) {
			observer.update(strokes,par);
		}
	}
	public String getName() {
		return name;
	}
	
}
