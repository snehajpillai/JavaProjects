package com.deloitte.flyer;

public class Airplane extends Vehicle implements Flyer {

	@Override
	public void takeOff() {
		System.out.println("Airplane Taking off");

	}

	@Override
	public void land() {
		System.out.println("Airplane Landing");

	}

	@Override
	public void fly() {
		System.out.println("Airplane Flying");

	}

}
