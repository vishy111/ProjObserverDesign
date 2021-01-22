/**
 * 
 * @author vishalkosaraju
 *
 */
public interface Subject {
	/**
	 * The Subject of observation has a register add for the Observer
	 * @param observers that pass through the register
	 */
	public void registerObserver(Observer observer);
	/**
	 * The Subject of observation has a register remove for the Observer
	 * @param observers that pass through the register
	 */
	public void removeObserver(Observer observer);
	/**
	 * This method notifies the observes and passes the strokes and pars
	 * @param strokes, and par are both integers that pass through to notify the observers
	 */
	public void notifyObservers(int strokes, int par);

}
