package array;

import java.util.Arrays;
import java.util.Scanner;

public class userInput {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		System.out.println("Enter the size of array:");
		n = input.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements of array:");
		for(int i = 0; i <= n - 1;i++) {
			arr[i] = input.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		

	}

}
