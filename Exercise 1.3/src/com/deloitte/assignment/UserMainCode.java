package com.deloitte.assignment;

public class UserMainCode {
	static boolean checkTripplets(int arr[]){
		for(int i=1;i<arr.length-2;i++) {
			if((arr[i]==arr[i+1]) && (arr[i+1]==arr[i+2])) {
				return true;
			}
			else {
				continue;
			}
		}
		return false;
	}
}
