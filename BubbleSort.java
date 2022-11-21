package kafka.sorting_algo;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {10,2,3,1,0,9};
		
		System.out.println("Original : "+Arrays.toString(arr));
		
		// time complexity = O(n^2)
		
		for(int i=0; i<arr.length-1; i++ ) {
			for(int j=0; j<arr.length-1; j++) {
				int temp = 0;
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		// Time complexity
		// (n-1) + (n-2) + (n-3) + ...... + 2 + 1
		// O(n^2)
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length - i - 1; j++) {
				int temp = 0;
				if(arr[j] > arr[j+1]) {
					temp 	 = arr[j];
					arr[j]	 = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		// --------------- MORE OPTIMIZE ----------------
		for(int i=0; i<arr.length - 1; i++) {
			boolean swapped = false;
			for(int j=0; j<arr.length - i - 1; j++) {
				int temp = 0;
				if(arr[j]>arr[j+1]) {
					temp 	 = arr[j];
					arr[j]	 = arr[j+1];
					arr[j+1] = temp;
					swapped = true;
				}
			}
			if(swapped == false) {
				break;
			}
		}
		
		System.out.println("Sorted   : "+Arrays.toString(arr));
	}

}
