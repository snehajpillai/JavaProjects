package com.deloitte.cui;

public class EmplyeeBo {
	public void calincomeTax (EmplyeeVo ev) {
        double annualincome = ev.getAnnualincome();
 		double tax = 0;
 		if (annualincome > 1000000) {
 			tax = 0.4 * annualincome;
 		} else if (annualincome > 500000) {
 			tax = 0.3 * annualincome;
 		} else {
 			tax = 0.2 * annualincome;
 		}
 		ev.setIncometax(tax);
	}
}
