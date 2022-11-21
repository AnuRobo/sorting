package kafka.sorting_algo;

import java.util.Arrays;

/*
 * counting sort is a Linear time algorithm for the cases when our input element are in a small range
 * It is not a comparison based algo, it never compares items with each other rather it counts the occurrences
 * Counting sort is useful only when K is liner in terms of N, N/2, 2N or 3N when K becomes nlogn or quadratic it is of no use
 * 
 * */

public class CountingSort {

	public static void main(String[] args) {
		// Naive Approach θ(n+k)
		// Problem with this approach 
		// Cannot be used as general purpose algorithm for sorting objects with multiple members, like sorting an array of students by marks
		// Because here we are assign index in the array
		int[] arr = {1,4,4,1,0,1};
		
		int k = 0;
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]>k) {
				k = arr[i];
			}
		}
//		System.out.println(Arrays.toString(countSort(arr, arr.length, k+1)));
		
				
		// General Purpose Approach
		System.out.println(Arrays.toString(genCountSort(arr, arr.length, k+1)));
		
	}
	
	private static int[] countSort(int[] arr, int n, int k) {
		int[] count = new int[k];
		
		for(int i=0; i<k; i++) { // θ(k)
			count[i] = 0;
		}// [0,0,0,0,0]
		
		for(int j=0; j<n; j++) { // θ(n)
			count[arr[j]]++;
		}//[1,3,0,0,2]
		
		/*
		 * count array = [1,3,0,0,2]
		 * How doe we use this count arr to sort the array?
		 * We know that 0 appears 1 time so we run a loop for count 0 for 1 and put zero those many times
		 * */
		int index = 0;
		
		for(int h=0; h<k; h++) { // θ(n+k)
			for(int g=0; g<count[h]; g++) {
				arr[index] = h;
				index++;
			}
		}
		
		return arr;
	}
	
	/*
	 * Not a comparison based algo
	 * θ(n+k) Time
	 * θ(n+k) Aux space
	 * Stable
	 * Used as a subroutine in Radix sort
	 * */
	private static int[] genCountSort(int[] arr, int n, int k) {
		int[] count = new int[k];
		
		for(int i = 0; i<k; i++) {
			count[i] = 0;
		}
		for(int i = 0; i<n; i++) {
			count[arr[i]]++;
		}
		
		for(int j = 1; j<k; j++) {
			count[j] = count[j-1]+count[j];
		}// [1,4,4,4,6]
		
		
		int[] output = new int[n];
		for(int i=n-1; i>=0; i--) {
			output[count[arr[i]] - 1] = arr[i];
			count[arr[i]]--;
		}
		for(int j = 0; j<n; j++) {
			arr[j] = output[j];
		}
		
		return arr;
	}

}
