package tictactoe;

import java.util.Scanner;

public class KrestikiNoliki{
	static final int RazmerPolya = 3;
	static final char player = '0';
	static final char player2 = 'x';
	static final char Null = '!';
	static Scanner vod = new Scanner(System.in);
	static final char[][] pole = new char[RazmerPolya][RazmerPolya];

	static void inicializacia() {                   //Задаёться нулевое значение точкам поля
		for (int i=0; i<RazmerPolya; i++){
			for (int j=0; j<RazmerPolya; j++) {
				pole[i][j] = Null;
			}
		}
	}
	static void Pole() {                              //Вводиться поле
		for (int i=0; i<RazmerPolya; i++) {
			for (int j=0; j<RazmerPolya; j++) {
				System.out.print(pole[i][j] + "\t");
			}
			System.out.println();
		}
	}
	static void Player() {                          //Ход ноликов
		int x, y;
		do {
			x = vod.nextInt() - 1;
			y = vod.nextInt() - 1;
		}while (! isCellValid(x,y));
		pole[y][x] = player;
	}
	static void Player2() {                        //Ход крестиков
		int x, y;
		do {
			x = vod.nextInt() - 1;
			y = vod.nextInt() - 1;
		}while (! isCellValid(x,y));
		pole[y][x] = player2;
	}
	
	static boolean isCellValid(int x, int y) {  //смотрит подходит ли координаты
		if (x<0 || x>= RazmerPolya || y < 0 || y>= RazmerPolya) return false;
		if (pole[y][x] == Null) return true;
		return false;
	}
	static boolean isFreeSpace() {               //поиск свободного места
		for (int i = 0; i < RazmerPolya; i++) {
			for (int j = 0; j < RazmerPolya; j++) {
				if (pole[i][j] == Null) return false;
			}
		}
		return true;
	}
    static boolean checkWin(char sym) {              //постоянная проверка конца игры 
    	for (int i = 0; i < RazmerPolya; i++) {
    		int result = 0;
    		for (int j = 0; j < RazmerPolya; j++) {
    			if (pole[i][j] == sym) result++;
    		}
    		if (result == RazmerPolya) return true;
    	}
    	for (int i = 0; i < RazmerPolya; i++) {
    		int result = 0;
    		for (int j = 0; j < RazmerPolya; j++) {
    			if (pole[i][j] == sym) result++;
    		}
    		if (result == RazmerPolya) return true;
    	}
    	int first=0;
    	for (int i = 0; i < RazmerPolya; i++) {
    		for (int j = 0; j < RazmerPolya; j++) {
    			if (j == i && pole[i][j] == sym) first++;
    		}
    	}
    	if (first == RazmerPolya) return true;
    	int second = 0;
    	for (int i = 0, j = RazmerPolya-1; i < RazmerPolya && j >= 0; i++,j--) {
    		if (pole[i][j] == sym) second++;
    	}
    	if (second == RazmerPolya) return true;
    	return false;
    }
    public static void main(String[] args) {
    	inicializacia();
    	Pole();
    	while(true) {
    		Player();
    		Pole();
    		if (checkWin(player)) {
    			System.out.println("Выйграли нолики");
    			break;
    		}
    		if (isFreeSpace()) {
    			System.out.println("Ничья");
    			break;
    		}
    		Player2();
    		System.out.println();
    		Pole();
    		if (checkWin(player2)) {
    			System.out.println("Выйграли крестики");
    			break;
    		}
    		if (isFreeSpace()) {
    			System.out.println("Ничья");
    			break;
    		}
    	}
    }
}






















