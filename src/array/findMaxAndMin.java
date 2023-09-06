package array;

public class findMaxAndMin {

		public static int findMax(int[] arr) {
			int max = arr[0];
			for(int num: arr) {
				if(num > max)
					max = num;
			}
			return max;
		}
		
		public static int findMin(int[] arr) {
			int min = arr[0];
			for(int num: arr) {
				if(num < min)
					min = num;
			}
			return min;
		}
		
		public static void main(String[] args) {
			int[] arr = {19,23,56,89,119};
			
			System.out.println("Maximum element in this array:"+findMax(arr));
			System.out.println("Minimum element in this array:"+findMin(arr));
			
		}

	}

