package com.practice.arrays;

import java.util.Scanner;

//Sort an array so that first half in ascending and second half in descending order

public class Sorting_based_1 {

	public static void main(String[] args) {
		System.out.println("Enter the length of array.......");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the array.....");
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
		             arr[i] = arr[j];
		             arr[j] = temp;
				}
				
			}
		}System.out.println("First half in ascending .....");
		for(int j=0; j<arr.length/2; j++) {
			System.out.println(arr[j]);
		}System.out.println("Second half in descending .....");
		for(int j=arr.length-1; j>=arr.length/2; j--) {
			System.out.println(arr[j]);
		}
	}

}
