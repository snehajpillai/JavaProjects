package com.deloitte.flyer;

public class SeaPlane extends Airplane implements Sailer {
	@Override
	public void dock() {
		System.out.println("docking seaPlane");

	}

	@Override
	public void cruise() {
		System.out.println(" Cruising seaPlane");

	}

}
