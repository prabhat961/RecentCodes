package array;

public class range {
	public static int arrayRange(int[] arr) {
		int max = arr[0];
			for(int num: arr) {
				if(num > max)
					max = num;
			}
			
		
	
			int min = arr[0];
			for(int num: arr) {
				if(num < min)
					min = num;
			}
			int range = max - min;
			return range;
			
	}

	public static void main(String[] args) {
		int[] arr = {19,23,56,89,119};
		System.out.println("Range of the given array is:"+arrayRange(arr));

	}

}
