package tictactoe;

import java.util.Arrays;

public class perevortODNOMERMAS {
	public static void invertUsingFor(int[] arr) {
    for (int i = 0; i < arr.length / 2; i++) {
        int temp = arr[i];
        arr[i] = arr[arr.length - 1 - i];
        arr[arr.length - 1 - i] = temp;
    }
}
	public static void main(String[] args) {
		int[] arr = {7, 8, 9,10};
		System.out.println();
		invertUsingFor(arr);
		for (int i = 0; i < arr.length; i++){
        System.out.print(arr [i] + "\t");
    }
}
}
