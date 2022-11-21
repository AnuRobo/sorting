package kafka.sorting_algo;

public class IntersectionOfTwoSortedArray {
	
	public static void main(String[] args) {
		int[] arr1 = {1,2,20,20,40,60};
		int[] arr2 = {2,20,20,20,40};
		
		int m = arr1.length;
		int n = arr2.length;
		
		// O(n*m)
		intersection(arr1, arr2, m, n);
		
		System.out.println(" ");
		
		// if both array is sorted
		intersect(arr1, arr2, m, n);
	}

	private static void intersection(int[] a, int[] b, int m, int n) {
		for(int i=0; i<m; i++) {
			if(i>0 && a[i]==a[i-1]) {
				continue;
			}
			
			for(int j=0; j<n; j++) {
				if(a[i]==b[j]) {
					System.out.print(a[i]+",");
					break;
				}
			}
		}
	}
	
	private static void intersect(int[] a, int[] b, int m, int n) {
		int i = 0, j = 0;
		
		while(i<m && j<n) {
			if(i>0 && a[i]==a[i-1]) {
				i++;
				continue;
			}
			if(a[i] < b[j]) {
				i++;
			}
			else if(a[i] > b[j]) {
				j++;
			}
			else{
				System.out.print(a[i]+" ");
				i++;
				j++;
			}
			
		}
	}
}