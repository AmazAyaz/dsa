package arrays;

public class ReverseArrayBySwapping {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
        reverseArrayBySwappingElement(arr, arr.length);
	}
	
	static void reverseArrayBySwappingElement(int arr[], int n) {
		
	int temp;
	
	for(int i=0; i<n/2; i++) {
		
		temp = arr[i];
		arr[i] = arr[n-i-1] ;
		
		arr[n-i-1]= temp;
		
	}
	for(int arrayElement : arr) {
	System.out.print(arrayElement + ",");
	
	}
	
	}

}
