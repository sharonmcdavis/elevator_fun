package com.elevator.fun.domain;

import java.util.ArrayList;
import java.util.List;



public class ElevatorBank {
	List<Elevator> elevatorList;
	Integer minFloors;
	Integer minElevators;
	Integer maxFloors;
	Integer maxElevators;
	
	public ElevatorBank() {
		super();
	}

	public ElevatorBank(Integer maxFloors, Integer maxElevators) {
		super();
		
		this.maxFloors = maxFloors;
		this.maxElevators = maxElevators;
		
		this.elevatorList = new ArrayList<Elevator>();
		for (int i= 0; i < maxElevators; i++)
			this.elevatorList.add(new Elevator());

	}
	
	public Elevator findElevator() {
		
		for (int i= 0; i < maxElevators; i++) {
			//find available elevator
			//return desired elevator
			return elevatorList.get(index);
			
		}
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
