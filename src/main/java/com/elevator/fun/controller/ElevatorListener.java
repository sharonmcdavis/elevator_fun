package com.elevator.fun.controller;

import java.util.ArrayList;
import java.util.List;

public interface ElevatorListener {
	void callElevator(int floor);

	class Initiater {
	    private List<ElevatorListener> listeners = new ArrayList<ElevatorListener>();

	    public void addListener(ElevatorListener toAdd) {
	        listeners.add(toAdd);
	    }
	}

	class Responder implements ElevatorListener {
	    @Override
	    public void callElevator(int floor) {
	        ElevatorController.callElevator(floor);
	    }

	}
	 

	class Test {
	    public static void main(String[] args) {
	        Initiater initiater = new Initiater();
	        Responder responder = new Responder();

	        initiater.addListener(responder);

	    }
	}

}
