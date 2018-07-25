package com.deloitte.flyer;

public class RiverBarge extends Vehicle implements Sailer {

	@Override
	public void dock() {
		System.out.println("docking RiverBarge");

	}

	@Override
	public void cruise() {
		System.out.println(" Cruising RiverBarge");

	}

}
