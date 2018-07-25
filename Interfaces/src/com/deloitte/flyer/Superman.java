package com.deloitte.flyer;

public class Superman extends Kryptonian implements Flyer {

	@Override
	public void takeOff() {
		System.out.println("Sman Taking off");

	}

	@Override
	public void land() {
		System.out.println("Sman Landing");

	}

	@Override
	public void fly() {
		System.out.println("Sman Flying");
	}
	public void leapBuilding() {
		System.out.println("Leaping from building");

	}
	public void stopBullet() {
		System.out.println("Stopping bullet");

	}
}
