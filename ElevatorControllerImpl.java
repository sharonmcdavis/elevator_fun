package com.elevator.fun.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.elevator.fun.domain.Elevator;
import com.elevator.fun.domain.ElevatorBank;
import com.elevator.fun.utils.ApplicationProperties;

public class ElevatorControllerImpl implements ApplicationProperties {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//set number of floors and elevators
		//use parameters from command line/call
		//if no parms, default to mins
		Integer maxFloors;
		Integer maxElevators;
		
		if (args.length == 0) {
			//default elevators and floor 
			maxFloors = MIN_FLOORS;
			maxElevators = MIN_ELEVATORS;
			
		} else {
			maxFloors = Integer.parseInt(args[0]);
			maxElevators = Integer.parseInt(args[1]);
			
		}
		
		
	}

}
