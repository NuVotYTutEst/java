

package javaprojekt;

import java.util.Scanner;

public class krest{
	
	public static void bistria(int[] source, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int pivo = source[(leftMarker + rightMarker) / 2];
        do {
            // Двигаем левый маркер слева направо пока элемент меньше, чем pivo
            while (source[leftMarker] < pivo) {
                leftMarker++;
            }
            // Двигаем правый маркер, пока элемент больше, чем pivo
            while (source[rightMarker] > pivo) {
                rightMarker--;
            }
            // Проверим, не нужно обменять местами элементы, на которые указывают маркеры
            if (leftMarker <= rightMarker) {
                // Левый маркер будет меньше правого только если мы должны выполнить swap
                if (leftMarker < rightMarker) {
                    int tmp = source[leftMarker];
                    source[leftMarker] = source[rightMarker];
                    source[rightMarker] = tmp;
                }
                // Сдвигаем маркеры, чтобы получить новые границы
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        // Выполняем рекурсивно для частей
        if (leftMarker < rightBorder) {
        	bistria(source, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
        	bistria(source, leftBorder, rightMarker);
        }
}
	public static void main(String args[]) {
		int[] source = {4, 3, 1, 7, 5, 2, 9, 6, 8, 0};
		bistria(source, 0, source.length - 1);
	    for (int i = 0; i < source.length; i++)
	    System.out.print(source[i] + "\n");
}
}
