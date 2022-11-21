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


public class Quick_Sort_Hoare {

	public static void main(String[] args) {
		int[] arr = {8,4,7,9,3,10,5};
		
		int low = 0;
		int high = arr.length - 1;
		
		System.out.println(Arrays.toString(qSort(arr, low, high)));
	}
	
	private static int[] qSort(int[] a, int l, int h) {
		if(l<h) {
			int p = hPartition(a, l, h);
			qSort(a, l, p);
			qSort(a, p+1, h);
		}
		return a;
	}
	
	private static int hPartition(int[] a, int l, int h) {
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
				return j;
			}
			
			a = swap(a, i, j);
		}
	}
	
	private static int[] swap(int a[], int i, int j) {
		int temp = 0;
		temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		
		return a;
	}

}
