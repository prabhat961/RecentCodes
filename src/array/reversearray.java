package array;

import java.util.Arrays;

public class reversearray {
	public static void reverse(int[] arr) {
		int lo = 0;
		int hi = arr.length -1;
		while(lo <= hi) {
			int temp = arr[lo];
			arr[lo] = arr[hi];
			arr[hi] = temp;
			lo++;
			hi--;
		}
	}

	public static void main(String[] args) {
		
		int[] arr = {19,23,56,89,119};
		System.out.println("Array is:"+Arrays.toString(arr));
		reverse(arr);
		System.out.println(" Reversed Array is:"+Arrays.toString(arr));

	}

}
