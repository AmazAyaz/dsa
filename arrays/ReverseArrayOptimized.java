package arrays;

public class ReverseArrayOptimized {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
		
		reverseArray(arr,arr.length);
		

	}
	
	static void reverseArray(int arr[],int arrayLength) {
		
		int b[] = new int[arrayLength];
		
		int j = arrayLength;
		
		
		for(int i=0; i<arrayLength; i++) {
			
			b[j-1] = arr[i];
			
			j = j-1;
			
		}
		
		for(int arraysElement : b) {
			System.out.print(arraysElement+ ",");
		}
	}

}
