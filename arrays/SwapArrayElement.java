package arrays;
public class SwapArrayElement {
	
	public static void main(String[] args) {
		
		int arr[] = {2,7,3,5,9};
		int arr1[] = {2,7,3,5,9};
		// hold index 0 element that is 2 in a temp variable
		int temp = arr[0];
		//assign index 0 element that is 2 to index first element 
		arr[0] = arr[1];
		//now make 1st index value at o index --swapped
		arr[1] = temp;
		
		for(int i=0 ; i<arr.length; i++) {
			//System.out.print(arr[i]+ ",");
		}
		
		
			int temp1 = arr1[0];
			arr[0] = arr[arr.length-1];
			arr[arr.length-1] = temp1;
			
			for(int i=0 ; i<arr.length; i++) {
				System.out.print(arr[i]+ ",");
			}
	
	}
}