package com.deloitte.cui;

import java.util.Comparator;

public class EmplyeeSort implements Comparator<EmplyeeVo> {

		public EmplyeeSort() {

		}

		@Override
		public int compare(EmplyeeVo emp1, EmplyeeVo emp2) {

			return (int) (emp1.getIncometax() - emp2.getIncometax());
		}

		
	}

