package com.practice.arrays;

import java.util.Scanner;

public class Reverse_an_Arrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int [] arr;
		System.out.println("Enter size of array.....");
		n = sc.nextInt();
		arr = new int[n];
		System.out.println("enter array");
	for(int i=0; i<arr.length; i++) {
	    arr[i] = sc.nextInt();
	}
	
	System.out.println("Array is .......");
	for(int ar : arr) {
    System.out.println(ar);
	}
	
	
	System.out.println("Reverse of the array is........");
	for(int j=(arr.length-1); j>=0; j--) {
		System.out.println(arr[j]);
	}


}
}