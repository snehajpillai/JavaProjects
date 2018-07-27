package com.deloitte.assignment;

import java.util.Scanner;

public class Main extends UserMainCode  {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter array size");
			int len = sc.nextInt();
			int array[] = new int[len];
			System.out.println("enter all the numbers");
			for(int j=0;j<len;j++)
			{
				array[j]=sc.nextInt();
			}
			boolean flag= UserMainCode.checkTripplets(array);		
				if(flag) {
				System.out.println("TRUE");
				}
				else {
				System.out.println("FALSE");
				}
				sc.close();
		}	
	}
		

