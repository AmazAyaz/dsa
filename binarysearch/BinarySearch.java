package binarysearch;

public class BinarySearch {

	
	public static void main(String[] args) {

		int arr[] = { 2, 3, 5, 7, 9, 14, 16 };
	
	  
	    int res = binarySearch(arr,2);
	    System.out.println(res);
	
	
	}


	static int binarySearch(int arr[], int target) {
		 
		int start = 0;
		int end = arr.length-1;
		
		int mid = (start+end)/2;
		
		while(start<=end) {
			
			if(target > arr[mid]) {
				
				start = mid+1;
			} 
			
			else if(target == arr[mid]  ) {
				return mid;
				
			}
			
			else {
				end = mid-1 ;
			}
		
			mid = (start + end)/2;
		 
	 }

		
 
    return -1;


}

}
 