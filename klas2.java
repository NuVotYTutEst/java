package javaprojekt;

import java.util.Scanner;

public class klas2 {
    public static void shakerSort(int arr[]) {
        int buff;
        int left = 0, right = arr.length - 1; //левая и правая граница
        do {
            for (int i = left; i < right; i++) { //больший элемент в конец массива
                if (arr[i] > arr[i + 1]) {
                    buff = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = buff;
                }
            }
            right--;
            for (int i = right; i > left; i--) { //меньший элемент в начало
                if (arr[i] < arr[i - 1]) {
                    buff = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = buff;
                }
            }
            left++;
        } while (left < right); //левая граница меньше правой
    }
    public static void main(String args[]) {
		Scanner sc = new Scanner (System.in );
		System.out.print("Input a number: ");
		int size = sc.nextInt();
		int array[] = new int[size];
		System.out.println("Insert array elements:");
	    for (int i = 0; i < size; i++){ 
	    array[i] = sc.nextInt(); 
	    }
	    System.out.print ("Inserted array elements:");
	    for (int i = 0; i < size; i++) {
	    System.out.print (" " + array [i]);
	    }
	    System.out.println();
	    shakerSort(array);
	    for (int i = 0; i < array.length; i++){
        System.out.print(array [i] + "\n");
}
}
}
