package tictactoe;

public class test5 {
    public static void main(String[] args) {
        String str = "qweeukfgeeeet";
        String str1 = "";
        String max = "";
        int k = str.length();
        for (int i = 0; i <= k; i++) {
            char result1 = str.charAt(i);

            if (i == k - 2) {
                if (str.charAt(i) != str.charAt(k-1)) {
                    str1 += str.charAt(i);
                    str1 += str.charAt(k-1);
                    if (max.length() < str1.length()) {
                        max = str1;
                    }
                }
                break;
            }

            char result2 = str.charAt(i + 1);
                if (result1 != result2) {
                    str1 = str1 + str.charAt(i);
                }

                if (result1 == result2) {
                    str1 += str.charAt(i);
                    if (max.length() < str1.length()) {
                        max = str1;
                    }
                    str1 = "";
                }
            }
        System.out.println(max);
        System.out.println(max.length());
        }
    }
