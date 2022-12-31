package arrays;

// Time complexity for this would be O(n^2)
public class ReverseArray {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
		
		int size = arr.length;
		
		
		
		int temp = arr[0];
		for(int i=0; i<=size/2; i++) {
			
			for(int j=size-1; j>size/2; j--) {
			
			if((arr[i] <= arr[j])) {
			
		    temp = arr[i];
			arr[i]=arr[j];
			
			arr[j] = temp;
			
			//System.out.println(arr[i]);
		}
			
			}
			
			
		}
           for(int arrayElement : arr) {
        	   System.out.println(arrayElement);
           }
	}

}
