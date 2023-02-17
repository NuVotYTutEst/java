package javaprojekt;

import java.util.Scanner;

public class Main {
	public static void vstavka(int[] arr) { 
		for (int i = 1; i < arr.length; i++) {  //цикл неотсортированой части
			int plant = arr[i];  // первый элемент неотсортированой части
			int j = i;
			while ( j > 0 && arr[j - 1] > plant) {	//сдвигаем элементы вправо, чтобы освободить место
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = plant;  //вставляем в освободившееся место
		}
	}
	public static void main(String args[]) {
		Scanner input = new Scanner (System.in );
		System.out.print("Input a number: ");
		int size = input.nextInt();
		int array[] = new int[size];
		System.out.println("Insert array elements:");
	    for (int i = 0; i < size; i++){ 
	    array[i] = input.nextInt(); 
	    }
	    System.out.print ("Inserted array elements:");
	    for (int i = 0; i < size; i++) {
	    System.out.print (" " + array [i]);
	    }
	    System.out.println();
	    vstavka(array);
	    for (int i = 0; i < array.length; i++){
        System.out.print(array [i] + "\n");
}
}
}
	