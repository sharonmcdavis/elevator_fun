/**
 * 
 */
package com.elevator.fun.domain;

import java.util.PriorityQueue;

import com.elevator.fun.utils.ApplicationProperties.DoorStatus;
import com.elevator.fun.utils.ApplicationProperties.ElevatorStatus;

/**
 * @author sdavis
 *
 */
public class Elevator {

	PriorityQueue<Integer> destinationFloor; 
	Integer currentFloor;
	ElevatorStatus direction;
	DoorStatus doorStatus;
	
	public String moveUp() {
		currentFloor++;
		return reportStatus();
	}

	public String moveDown() {
		currentFloor--;
		return reportStatus();
	}

	public void requestFloor(Integer newFloor) {
		destinationFloor.add(newFloor);
	}
	
	public String openDoor() {
		doorStatus = DoorStatus.DOOR_OPEN;
		return reportStatus();
	}
	
	public String closeDoor() {
		doorStatus = DoorStatus.DOOR_CLOSE;
		return reportStatus();
	}
	public String reportStatus() {
		return(
		"requested floor count: " + destinationFloor.size() + 
		"currentFloor: " + currentFloor + 
		"direction: " + direction +
		"door status: " + doorStatus
		);
	}
}
