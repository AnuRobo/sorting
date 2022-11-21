package kafka.sorting_algo;

import java.util.Arrays;

// SELECTION SORT IS NOT STABLE because if there are two elements with same value, it may change the order of these elements

/*
 * Selection sort algorithm sorts an array by repeatedly finding the minimum element 
 * (considering ascending order) from the unsorted part and putting it at the beginning.
 * */

/*
 * n-place algorithm is an algorithm that does not need an extra space and produces an 
 * output in the same memory that contains the data by transforming the input
 * */
public class Selection_sort {

	public static void main(String[] args) {
		// O(n^2)
		// Does less memory writes compared to QuickSort, mergeSort, InsertionSort etc. But CycleSOrt is optimal in terms of memory writes
		// Basic Idea for HeapSort
		// Not Stable
		// In Place means it does not require extra memory for sorting
		
		int[] o_arr = {64,32,1,2,20,19,0};
		
		int sorted_arr[] = new int[o_arr.length];
		
	/*	
		int pos = 0;
		for(int i = 0; i<o_arr.length; i++) {
			for(int j =i+1; j<o_arr.length; j++) {
				if(o_arr[pos]>o_arr[j]) {
					pos = j;
				}
			}
			
//			sorted_arr[i] = o_arr[pos];
//			o_arr[pos] = -1;
			System.out.println(pos);
			int temp =0;
			temp = o_arr[pos];
			o_arr[pos] = o_arr[i];
			o_arr[i] = temp;
			
			pos=i+1;
		}
		
		System.out.println(Arrays.toString(o_arr));
		*/
		
		for(int i = 0; i<o_arr.length; i++) {
			int min_int = 0;
			for(int j = 1; j<o_arr.length; j++) {
				if(o_arr[j]<o_arr[min_int]) {
					min_int = j;
				}
			}
			
			sorted_arr[i] = o_arr[min_int];
			o_arr[min_int] = Integer.MAX_VALUE;
		}
		
		System.out.println(Arrays.toString(sorted_arr));
	}

}
