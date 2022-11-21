package kafka.sorting_algo;

import java.util.Arrays;

// O(n) 
// space O(1)
// Not Stable

/*
 * We consider first element as PIVOT element
 * we begin with two index from starting(i) and ending(j) of array
 * we stop when they cross each other or same (i>=j)
 * elements from l to i are smaller and j to h are greater then/equal to pivot 
 * */

public class Hoare_Partition {

	public static void main(String[] args) {
//		int[] arr = {5,3,8,4,2,7,1,10};
		int[] arr = {8,4,7,9,3,10,5};
		
		int low = 0;
		int high = arr.length - 1;
		
		System.out.println(Arrays.toString(hPartition(arr, low, high)));
	}

	private static int[] hPartition(int[] a, int l, int h) {
		int pivot = a[l]; // pivot as first element
		
		int i = l-1, j=h+1;
		
		while(true) {
			do {
				i++;
			}while(a[i]<pivot);
			
			do {
				j--;
			}while(a[j]>pivot);
			
			if(i>=j) {
				return a;
			}
			
			a = swap(a, i, j);
		}
	}
	
	private static int[] swap(int[] a, int i, int j) {
		int temp = 0;
		temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		
		return a;
	}
}
