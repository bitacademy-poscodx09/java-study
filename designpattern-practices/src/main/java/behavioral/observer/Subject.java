package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject<T> {
	private T val;
	private List<Observer<T>> observerCollection = new ArrayList<>();
	
	public void registerObserver(Observer<T> observer) {
		observerCollection.add(observer);
	}
	
	public void unregisterObserver(Observer<T> observer) {
		observerCollection.remove(observer);
	}

	public void changeSubject(T val) {
		this.val = val;
		notifyObservers();
	}

	private void notifyObservers() {
		for(Observer<T> observer : observerCollection) {
			observer.update(val);
		}
	}
}