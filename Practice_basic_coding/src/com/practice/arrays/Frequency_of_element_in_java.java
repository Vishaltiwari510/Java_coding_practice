package com.practice.arrays;

import java.util.Scanner;

public class Frequency_of_element_in_java {

	public static void main(String[] args) {
	System.out.println("Enter the length of array");
		int n;
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		System.out.println("Enter the array");
		int [] arr = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<arr.length; i++) {

			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
		             arr[i] = arr[j];
		             arr[j] = temp;
				}
				
			}
		
			
		}
		
		for(int i=0; i<arr.length; i++) {
			int count=1;
			while(i<arr.length-1 && arr[i]==arr[i+1]  ) {
				count++;
				i++;
			}
			System.out.println(arr[i]+": "+count);
			if(count==1) {
				System.out.println(arr[i]);
			}
		}
		
		
	}

}
