package tictactoe;

import java.util.Scanner;

public class Diagonal {
	public static void main(String[] args) {
		int[][] arr = {{0, 0, 0,},
					  {0, 0, 0,},
					  {0, 0, 0,}};
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите элементы массива:");
		for(int i = 0; i < arr.length; i++) {
	        for (int j = 0; j < arr[i].length; j++) {
	        	arr[i][j] = scan.nextInt();
	        }
	    }
		for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++){
            	System.out.print(arr[i][j] + " ");
            }
            System.out.println();
    	}
		//второй массив
		int[][] ar = {{0, 0, 0,},
					 {0, 0, 0,},
					 {0, 0, 0,}};
		System.out.println("Введите элементы массива:");
		for(int i = 0; i < ar.length; i++) {
	        for (int j = 0; j < ar[i].length; j++) {
	        	ar[i][j] = scan.nextInt();
	        }
	    }
		for(int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++){
            	System.out.print(ar[i][j] + " ");
            }
            System.out.println();
    	}
		//массив с ответами
		int[][] a = {{0, 0, 0,},
					{0, 0, 0,},
					{0, 0, 0,}};
		//умножение

		for(int i = 0; i < ar.length; i++) {
	        for (int j = 0; j < ar[i].length; j++) {
	        	if(arr[i][j] == ar[i][j]) arr[i][j] * ar[i][j];
	        }
	    }
	}
}