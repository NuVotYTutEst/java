package tictactoe;
import java.util.HashMap;
	public class MahinaciiSStrokoi {
		    public static void main(String[] args) {
		        String str = "sdddddddddujjjjjjjrryhdddhkkkkkkkh";//хеш таблица
		        HashMap<Character, Integer> hashMap = new HashMap<>(); //хранение данных в виде пар ключ/значение,может повторятся
		        for (int i = 0; i < str.length(); i++) {//создается цыкл переберающая страку
		            char c = str.charAt(i);// превращение букв в цыфру
		            int num = 0;
		            for (int j = 0; j < str.length(); j++) {//переберание массива
		                char c1 = str.charAt(j);
		                if(c==c1){
		                    num++;
		                }
		            }
		            hashMap.put(c,num);// ключ и значение
		        }
		        System.out.println(hashMap);
		    }
		}

 