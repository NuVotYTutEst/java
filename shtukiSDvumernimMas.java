package javaprojekt;

import java.util.Arrays;
import java.util.Scanner;

public class shtukiSDvumernimMas{
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
    	for(int i = 0; i < arr.length; i++) {
    		invertUsingFor1(arr[i]);
            for (int j = 0; j < arr[i].length; j++){
            	System.out.print(arr[i][j] + " ");
            }
            System.out.println();
    	}
    	System.out.println();
    	for(int i = 0; i < arr.length; i++) {
    		for (int j = 0; j < arr[i].length; j++);
    	}
    	System.out.println(Arrays.deepToString(arr));
    	System.out.println();
    	//Главная диагональ
    	System.out.print("Главная диагональ: ");
    	for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) System.out.print(arr[i][j] + " ");
            }
        }
    	System.out.println();
    	//Побочная диагональ
    	System.out.print("Побочная диагональ: ");
    	for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i + j == arr.length - 1) System.out.print(arr[i][j] + " ");
            }
        }
    	System.out.println();
    	//под диаганалью
    	System.out.print("Под диаганалью: ");
    	for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
            	if (i > j) {
            		System.out.print(arr[i][j] + " ");
            	}
            }
        }
    	System.out.println();
    	//над диаганалью
    	System.out.print("Над диаганалью: ");
    	for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
            	if (i < j) {
            		System.out.print(arr[i][j] + " ");
            	}
            }
        }
    }
    public static void invertUsingFor1(int[] arr) {
    	for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }
}