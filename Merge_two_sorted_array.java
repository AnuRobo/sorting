package kafka.sorting_algo;

import java.util.Arrays;

public class Merge_two_sorted_array {

	public static void main(String[] args) {
		int[] arr1 = {10,15,20,20};
		int[] arr2 = {1,12};
		
		System.out.println("Array1 - " + Arrays.toString(arr1));
		System.out.println("Array2 - " + Arrays.toString(arr2));
		int[] new_arr = new int[arr1.length + arr2.length];
		
		// -------------------- Navie Approach --------------
		// O((m+n)*log(m+n))
		// Auxilary space - θ(m+n)
		
		for(int a1=0; a1<arr1.length; a1++) {
			new_arr[a1] = arr1[a1];
		}
		
		for(int a2=0; a2<arr2.length; a2++) {
			new_arr[arr1.length + a2] = arr2[a2];
		}
		
		System.out.println("Sorted - " + Arrays.toString(sorted(new_arr)));
		
		// -----------------------------------------------------------------------------------------------------
		// Efficient way
		// θ(m+n)
		// Aux space - O(1) we are simply printing the elements
		
		merge(arr1, arr2, arr1.length, arr2.length);
	}
	
	private static int[] sorted(int[] arr) {
		for(int i =1; i<arr.length; i++) {
			int key = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>key){
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		
		return arr;
	}
	
	
	private static void merge(int a[], int b[], int m, int n) {
		int i = 0, j = 0;
		
		while(i<m && j<n) {
			if(a[i]<=b[j]) {
				System.out.println(a[i]);
				i++;
			}else {
				System.out.println(b[j]);
				j++;
			}
		}
		
		while(i<m) {
			System.out.println(a[i]);
			i++;
		}
		while(j<n) {
			System.out.println(b[j]);
			j++;
		}
	}

}
