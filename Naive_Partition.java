package kafka.sorting_algo;

import java.util.Arrays;

public class Naive_Partition {

	public static void main(String[] args) {
		int[] arr = {5,13,6,9,12,11,8};
		int low = 0;
		int high = arr.length - 1;
		int pivot = arr[high];
		
		System.out.println(Arrays.toString(partition(arr, low, high, pivot)));
	}
	
	private static int[] partition(int[] a, int l, int h, int p) {
		int[] temp = new int[h - l + 1];
		int index = 0;
		
		for(int i=l; i<=h; i++) {
			if(a[i] <= p){
				temp[index] = a[i];
				index++;
			}
		}
		
		for(int j=l; j<=h; j++) {
			if(a[j] > p) {
				temp[index] = a[j];
				index++;
			}
		}
		
		return temp;
	}

}
