package javaprojekt;

public class fibanachi {
	public static void main(String args[]) {
		
		int[] arr = new int[11];
		arr[0] = 0;
		arr[1] = 1;
		for (int i = 2; i < arr.length; ++i) {
		  arr[i] = arr[i - 2] + arr[i - 1];
		}
		
		
		
		for (int i = 0; i < arr.length; ++i) {
			  System.out.println(arr[i]);
			}
	}

}
