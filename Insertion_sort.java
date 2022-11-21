package kafka.sorting_algo;

public class Insertion_sort {

	public static void main(String[] args) {
		// O(n^2) worst case
		// In Place and Stable
		// Used in practice for small arrays
		// O(n) in best case when input array is already sorted
		
		int[] arr = {20,5,40,60,10,30};
		
		for(int i =1; i<arr.length; i++) {
			int key = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>key){
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1]=key;
		}
	}

}
