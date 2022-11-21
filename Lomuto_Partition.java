package kafka.sorting_algo;

import java.util.Arrays;

// Lomuto Partition assumes that pivot is always the last element
// O(n)
// It requires O(1) extra space
// Not stable

public class Lomuto_Partition {

	public static void main(String[] args) {
		int[] arr = {10,80,30,90,40,50,70};
		
		System.out.println("Original - "+ Arrays.toString(arr));
		
		int low = 0;		
		int high = arr.length - 1;
		
		System.out.println("LomuoPar - "+Arrays.toString(lPartition(arr, low, high)));
	}
	
	private static int[] lPartition(int[] a, int l, int h) {
		int pivot = a[h];
		
		int i = l - 1;
		
		for(int j = l; j<=h-1; j++) {
			if(a[j] < pivot) {
				i++;
				a = swap(a, i, j);
			}
		}
		a = swap(a, i+1, h);
		return a;
	}
	
	private static int[] swap(int a[], int i, int j) {
		int temp = 0;
		temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		
		return a;
	}

}
