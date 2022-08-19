package com.practice.arrays;

import java.util.Scanner;

public class Largest_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int [] arr;
     arr = new int [10];
     Scanner sc = new Scanner(System.in);
     for(int i=0; i<arr.length; i++) {
    	 arr[i] = sc.nextInt();
     }
//     for(int i=0; i<arr.length; i++) {
//    	 System.out.println(arr[i]);
//     }
     int max = arr[0];
   
     for(int j=1; j<arr.length; j++) {
    	 if (arr[j]>max) {
    	 max = arr[j];
    	 }
     }
     System.out.println("Largest Number is "+max);
     sc.close();
     
	}

}
