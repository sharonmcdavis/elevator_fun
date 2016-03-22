package com.elevator.fun.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.elevator.fun.domain.Elevator;
import com.elevator.fun.domain.ElevatorBank;
import com.elevator.fun.utils.ApplicationProperties;

public class ElevatorController implements ApplicationProperties {
	private static final Logger logger = LoggerFactory.getLogger(ElevatorController.class);
	private static ElevatorBank elevatorBank; 
	public static int MAX_FLOORS = 1;
	public static int MAX_ELEVATORS = 1;
	public static int MIN_FLOORS = 1;
	public static int MIN_ELEVATORS = 1;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//set number of floors and elevators
		//use parameters from command line/call
		//if no parms, default to mins
		logger.info("MUReportingApp: Begin");
		
		if (args.length > 1) {
			MAX_FLOORS = Integer.parseInt(args[0]);
			MAX_ELEVATORS = Integer.parseInt(args[1]);
			
		}
		
		//instantiate elevators
		elevatorBank = new ElevatorBank();
		
	}

	public static void callElevator(int floor) {
		Elevator el = elevatorBank.findElevator(floor);
		el.move(floor);
		
		
	}

}
