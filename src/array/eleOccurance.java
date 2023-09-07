package array;

public class eleOccurance {
	public static int countOccurance(int[] arr, int ele) {
		int count = 0;
		for( int num: arr) {
			if (ele == num)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		  int[] arr = {21, 35, 22, 15, 87, 21, 35, 22, 15, 87, 21, 35, 22, 15, 87, 21, 21, 21, 21, 21};
	       System.out.println("Occur"+countOccurance(arr, 21));

	}

}
