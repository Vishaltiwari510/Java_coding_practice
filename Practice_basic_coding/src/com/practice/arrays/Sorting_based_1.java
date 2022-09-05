package com.practice.arrays;

import java.util.Scanner;

//Sort an array

public class Sorting_based_1 {

	public static void main(String[] args) {
		int arr[] = new int[10];
		System.out.println("Enter the array.....");
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<10; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<10; i++) {
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
		}
		for(int j=0; j<10; j++) {
			System.out.println(arr[j]);
		}
	}

}
