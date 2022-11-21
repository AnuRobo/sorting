package kafka.sorting_algo;

import java.util.Arrays;

/*
 * Divide and Conquer Algorithm
 * Worst case Time : O(n^2)
 * Despite O(n^2) worst case it is consider faster, because of the following reasons:
 * **** a) In-Place
 * **** b) Cache Friendly
 * **** c) Average case is O(nlogn)
 * **** d) Tail Recursive
 * 
 * Partitions in Key Function (Navie, Lomuto, Hoare)
 * */

public class Quick_Sort_Lomuto {

	public static void main(String[] args) {
		int[] arr = {8,4,7,9,3,10,5};
		
		int low = 0;
		int high = arr.length - 1;
		
		System.out.println(Arrays.toString(qSort(arr, low, high)));
	}
	
	private static int[] qSort(int[] a, int l, int h) {
		if(l<h) {
			int p = lPartition(a, l, h);
			qSort(a, l, p-1);
			qSort(a, p+1, h);
		}
		return a;
	}
	
	private static int lPartition(int[] a, int l, int h) {
//		System.out.println(h);
		int pivot = a[h];
		
		int i = l - 1;
		
		for(int j = l; j<=h-1; j++) {
			if(a[j] < pivot) {
				i++;
				a = swap(a, i, j);
			}
		}
		a = swap(a, i+1, h);
		return i+1;
	}
	
	private static int[] swap(int a[], int i, int j) {
		int temp = 0;
		temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		
		return a;
	}

}
