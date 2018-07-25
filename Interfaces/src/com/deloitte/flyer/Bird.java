package com.deloitte.flyer;

public class Bird  extends Animal implements Flyer{

	@Override
	public void takeOff() {
		System.out.println("Birdie Taking off");

	}

	@Override
	public void land() {
		System.out.println("Birdie Landing");

	}

	@Override
	public void fly() {
		System.out.println("Birdie Flying");

	}
	public void buildNest() {
		System.out.println("Building nest");
	}
	public void layEggs() {
		System.out.println("Laying eggs");
	}

}
