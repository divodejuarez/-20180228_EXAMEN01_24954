import java.util.ArrayList;
import java.util.List;

public abstract class BankX implements Observable{
	public List<Observer> accs = new ArrayList<Observer>();
	public Protocol p;
	
	@Override
	public void addObserver(Observer o) {
		accs.add(o);
	}
	
	@Override
	public void removeObserver(Observer o) {
		accs.remove(o);
	}
	
	@Override
	public void notifyObservers() {
		for(Observer acc : accs) {
			acc.transferCompleted();
		}
	}
}
