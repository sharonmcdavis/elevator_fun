package com.elevator.fun.utils;

public interface ApplicationProperties {
	public enum ElevatorStatus {
		ELEVATOR_UP,
		ELEVATOR_DOWN,
		ELEVATOR_MAINT,
		ELEVATOR_IDLE
	}
	
	public enum DoorStatus {
		DOOR_OPEN,
		DOOR_CLOSE
	}
	
	public static final Integer MIN_ELEVATORS = 1;
	public static final Integer MIN_FLOORS= 1;
}
