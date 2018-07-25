package com.deloitte.flyer.main;

import com.deloitte.flyer.Flyer;
import com.deloitte.flyer.Helicopter;
import com.deloitte.flyer.SeaPlane;

public class Airport {

	public static void main(String[] args) {
	Airport metAir=new Airport();
	Helicopter copter=new Helicopter();
	SeaPlane sPlane=new SeaPlane();
	metAir.givePermissionToLand(copter);
	metAir.givePermissionToLand(sPlane);
	}
	
	
	public void givePermissionToLand(Flyer f) {
		f.land();
	}

}
