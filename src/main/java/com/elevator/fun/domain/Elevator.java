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
	
	public void moveUp() {
		currentFloor++;
		
	}

	public void moveDown() {
		currentFloor--;
		
	}

	public void requestFloor(Integer newFloor) {
		destinationFloor.add(newFloor);
	}
	
	
}
