package com.bridgelabz.pattern.behaviooural;

import java.util.ArrayList;
import java.util.List;

public class subject {
private List<observer> observers =new ArrayList<observer>();
private int state;
/**
 * @return the state
 */
public int getState() {
	return state;
}
/**
 * @param state the state to set
 */
public void setState(int state) {
	this.state = state;
} 

public void attach(observer observer) {
	observers.add(observer);
}

public void notifyAllObservers() {
	for (observer observer : observers) {
		observer.update();
	}

}

}










































