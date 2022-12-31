package arrays;

public class ArrayLargestElement {

	public static void main(String[] args) {
      int a[] = new int[] {3,8,2,12,11,36};
      
      //System.out.println("largest Array element is = " + findLargestInArray(a));
      
      System.out.println(" largest with swap approach is = " + swapApproach(a));
	}

	public static int findLargestInArray(int arr[]) {

		int largest = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}
		return largest;
	}
	// Time complexity for this would be O(n^2)
	public static int swapApproach(int arr[]) {
		
		int temp;
		for(int i=0; i<arr.length; i++) {
		 
			for(int j=i+1; j<arr.length; j++ ) {
			 
				if(arr[i] > arr[j]) {
					
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
		 }
		}
		
		
		return arr[arr.length-1];
		
	}

}
