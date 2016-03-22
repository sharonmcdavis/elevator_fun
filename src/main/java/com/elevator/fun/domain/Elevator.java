/**
 * 
 */
package com.elevator.fun.domain;

import java.util.PriorityQueue;

import com.elevator.fun.controller.ElevatorController;
import com.elevator.fun.utils.ApplicationProperties.DoorStatus;
import com.elevator.fun.utils.ApplicationProperties.ElevatorStatus;

/**
 * @author sdavis
 *
 */
public class Elevator {

	PriorityQueue<Integer> destinationFloor; 
	int currentFloor;
	ElevatorStatus elevatorStatus;
	DoorStatus doorStatus;
	int trips = 0;
	int floors = 0;

	
	public String move(int floor) {
		trips++;
		if (trips == 100) 
			MaintIn();
		if (floor > currentFloor)
			return moveUp();
		return moveDown();
	}
	
	public String moveUp() {
		if (currentFloor < ElevatorController.MAX_FLOORS) {
			currentFloor++;
			elevatorStatus = ElevatorStatus.ELEVATOR_UP;
			floors++;
		}
		return reportStatus();
	}

	public String moveDown() {
		if (currentFloor > ElevatorController.MIN_FLOORS) {
			currentFloor--;
			elevatorStatus = ElevatorStatus.ELEVATOR_DOWN;
			floors++;
		}
		return reportStatus();
	}

	public void requestFloor(int newFloor) {
		destinationFloor.add(newFloor);
	}
	
	public void removeFloor(int newFloor) {
		destinationFloor.remove(newFloor);
	}

	public String openDoor() {
		doorStatus = DoorStatus.DOOR_OPEN;
		return reportStatus();
	}
	
	public String closeDoor() {
		doorStatus = DoorStatus.DOOR_CLOSE;
		return reportStatus();
	}
	
	public void MaintIn() {
		elevatorStatus = ElevatorStatus.ELEVATOR_MAINT;
		
	}

	public void MaintOut() {
		elevatorStatus = ElevatorStatus.ELEVATOR_MAINT;
		
	}
	
	public String reportStatus() {
		return(
		"requested floor count: " + destinationFloor.size() + 
		"currentFloor: " + currentFloor + 
		"direction: " + elevatorStatus +
		"door status: " + doorStatus
		);
	}

}
