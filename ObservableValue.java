package javaprojekt;

import java.util.Scanner;

public class ObservableValue {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    System.out.print("Введите n: ");
	        int n = scan.nextInt();
	        System.out.print("Введите m: ");
	        int m = scan.nextInt();
	        int[][] arr = new int[n][m];
	        for(int i = 0; i < arr.length; i++) {
	            for (int j = 0; j < arr[i].length; j++) {
	                arr[i][j] = ((int) (Math.random()*31));
	                System.out.print(arr[i][j] + "\t");     
	            }
	            System.out.println();
	            }
	        int max = arr[0][0];
	        for (int i = 0; i < arr.length; i++)
	        {
	            for (int j = 0; j < arr[0].length; j++)
	            {
	                if (max < arr[i][j])
	                {
	                    max = arr[i][j];
	                }
	            }
	        }
	        System.out.println("Max: " + max);
	        }
}
