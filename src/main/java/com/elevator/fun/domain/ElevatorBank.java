package com.elevator.fun.domain;

import java.util.ArrayList;
import java.util.List;

import com.elevator.fun.controller.ElevatorController;



public class ElevatorBank {
	List<Elevator> elevatorList;
	int minFloors;
	int minElevators;
	int maxFloors;
	int maxElevators;
	
	public ElevatorBank() {
		super();
		
		this.maxFloors = ElevatorController.MAX_FLOORS;
		this.maxElevators = ElevatorController.MIN_FLOORS;
		
		this.elevatorList = new ArrayList<Elevator>();
		for (int i= 0; i < maxElevators; i++)
			this.elevatorList.add(new Elevator());

	}
	
	public Elevator findElevator(int floor) {
		
		//loop through elevators
		//is elevator in maint mode? skip
		//is elevator on given floor?, return that elevator
		//is elevator moving in direction of given floor? return that elevator
		//is elevator idle, return that elevator
		return null;
		
	}

}
