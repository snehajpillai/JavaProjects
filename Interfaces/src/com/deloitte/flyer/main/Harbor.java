package com.deloitte.flyer.main;

import com.deloitte.flyer.RiverBarge;
import com.deloitte.flyer.Sailer;
import com.deloitte.flyer.SeaPlane;

public class Harbor {

	public static void main(String[] args) {
		Harbor bostonHarbor=new Harbor();
		RiverBarge barge= new RiverBarge();
		SeaPlane sPlane= new SeaPlane();
		bostonHarbor.givePermissionToDock(barge);
		bostonHarbor.givePermissionToDock(sPlane);
	}
	private void givePermissionToDock(Sailer s) {
		s.dock();
	}
}
