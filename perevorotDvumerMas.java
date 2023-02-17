package javaprojekt;

import java.util.Arrays;
import java.util.Scanner;

public class perevorotDvumerMas {
	 public static void main(String[] args){
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
	    	System.out.println();
	    	for(int i = 0; i < arr.length; i++) {
	    		invertUsingFor1(arr[i]);
	    	}
	    	System.out.println(Arrays.deepToString(arr));
	    }
	    public static void invertUsingFor1(int[] arr) {
	    	for (int i = 0; i < arr.length / 2; i++) {
	            int temp = arr[i];
	            arr[i] = arr[arr.length - 1 - i];
	            arr[arr.length - 1 - i] = temp;
	        }
	            }
	    	}
	    
	