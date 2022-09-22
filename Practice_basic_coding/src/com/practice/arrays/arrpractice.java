package com.practice.arrays;

import java.util.Scanner;

public class arrpractice {
	
	
	public static boolean check(long A[],long B[],int N)
    {    int c=0;
        //Your code here
        for(int i=0; i<N; i++){
            for(int j=0; j<B.length; j++){
                if(A[i]==B[j]){
                    c++;
                }
            }
        }
        
        if(c==N){
            return true;
        }
        else{
            return false;
        }
    }
	
	

	public static void main(String[] args) {
		System.out.println("Enter the size of array");
		Scanner sc = new Scanner(System.in);
		int N  = sc.nextInt();
		long A[] = new long[N];
		long B[] = new long[N];
		System.out.println("Enter elements in array 1");
  for(int i=0; i<N; i++) {
	  A[i] = sc.nextLong();
  }
  System.out.println("Enter elements in array 2");
  for(int j=0; j<N; j++) {
	  B[j] = sc.nextLong();
  }
  
  System.out.println(check(A, B, N));
	}

}
