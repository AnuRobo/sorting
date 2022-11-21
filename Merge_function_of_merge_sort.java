package kafka.sorting_algo;

import java.util.Arrays;

public class Merge_function_of_merge_sort {

	public static void main(String[] args) {
		int[] arr = {1,10,40,11,35,38};
		
		int low = 0;
		int high = arr.length - 1;
		int mid = (low+high)/2;

		System.out.println(Arrays.toString( merge(arr, low, mid, high)));
	}
	
	private static int[] merge(int a[], int low, int mid, int high) {
//		inr[] new_arr = new int[]
		int n1 = mid - low + 1, n2 = high - mid;
		
		int[] left = new int[n1], right = new int[n2];
		
		for(int i=0; i<n1; i++) {
			left[i] = a[low+i];
		}
		for(int j=0; j<n2; j++) {
			right[j] = a[mid+j+1];
		}
		
		int index1=0, index2=0, k=low;
		
		while(index1<n1 && index2<n2) {
			if(left[index1]<=right[index2]) {
				a[k] = left[index1];
				index1++;
				k++;
			}else {
				a[k] = right[index2];
				index2++;
				k++;
			}
		}
		
		while(index1 < n1) {
			a[k] = left[index1];
			index1++;
			k++;
		}
		while(index2 < n2) {
			a[k] = right[index2];
			index2++;
			k++;
		}
		
		return a;
	}

}
