package array;

public class checkElement {
	
	public static boolean isPresent(int[] arr, int m) {
		
		for( int i = 0; i <= arr.length - 1; i ++) {
			if( arr[i] == m )
				return true;
		}
		return false;
		
	}

	public static void main(String[] args) {
		int[] arr = {19,23,56,89,119};
		System.out.println("given element is present in the array:"+isPresent(arr, 115));

	}

}
