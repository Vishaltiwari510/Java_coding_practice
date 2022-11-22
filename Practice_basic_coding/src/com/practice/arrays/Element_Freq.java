package com.practice.arrays;
//Hash  Map practice:
import java.util.HashMap;
import java.util.Map;

public class Element_Freq {

	static void countFreq(int arr[], int n)
    {
	Map<Integer, Integer> mp  = new HashMap<>();
	for(int i=0; i<n; i++) {
		if(mp.containsKey(arr[i])) {
			mp.put(arr[i], mp.get(arr[i])+1);
		}
		else {
			mp.put(arr[i], 1);
		}
	}
	for(Map.Entry<Integer, Integer> entry :   mp.entrySet()) {
		System.out.println("Element : "+entry.getKey()+" Frequency : "+entry.getValue());
	}
    }
	
	public static void main(String[] args) {
		int[] arr = new int[]{ 1, 2, 2, 3, 4, 5, 5, 5, 6, 7, 8, 8 }; 
		int n = arr.length;
		countFreq(arr, n);
	}

}
