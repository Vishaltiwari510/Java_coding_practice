package com.practice.arrays;

import java.util.Scanner;

public class Smallest_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] arr;
       arr = new int[10];
       Scanner sc = new Scanner(System.in);
    	for(int i=0; i<arr.length; i++) {
    		arr[i] = sc.nextInt();
    	}
    	int min=arr[0];
    	for(int j=0; j<arr.length; j++) {
    		if(min>arr[j]) {
    			min = arr[j];
    		}
    	}
    	System.out.println("Smallest Element is "+min);
    	sc.close();
	}

}
