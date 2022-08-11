

package com.practice.basic;
import java.util.*;

public class PositiveOrNegativeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Number");
       int num = sc.nextInt();
       if(num>0) {
    	   System.out.println("Positive Number");
       }
       else if(num<0) {
    	   System.out.println("Negative Number");
       }
       else {
    	   System.out.println("Zero");
       }
	}

}
