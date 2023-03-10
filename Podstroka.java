package tictactoe;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class Podstroka {
    public static void main(String[] args) {
        String input = "stackoveerflowabcdefghijklmn";
        List<String> allOutPuts = new ArrayList<String>();
        TreeMap<Integer, Set> map = new TreeMap<Integer, Set>();
        for (int k = 0; k < input.length(); k++) {
            String input1 = input.substring(k);
            String longestSubString = getLongestSubString(input1);
            allOutPuts.add(longestSubString);
        }

        for (String str : allOutPuts) {
            int strLen = str.length();
            if (map.containsKey(strLen)) {
                Set set2 = (HashSet) map.get(strLen);
                set2.add(str);
                map.put(strLen, set2);
            } else {
                Set set1 = new HashSet();
                set1.add(str);
                map.put(strLen, set1);
            }

        }
        System.out.println(map.lastKey());
        System.out.println(map.get(map.lastKey()));
    }

    private static void printArray(Object[] currentObjArr) {
        for (Object obj : currentObjArr) {
            char str = (char) obj;
            System.out.println(str);
        }

    }

    private static String getLongestSubString(String input) {

        Set<Character> set = new LinkedHashSet<Character>();
        String longestString = "";
        int len = input.length();
        for (int i = 0; i < len; i++) {
            char currentChar = input.charAt(i);
            boolean isCharAdded = set.add(currentChar);
            if (isCharAdded) {
                if (i == len - 1) {
                    String currentStr = getStringFromSet(set);

                    if (currentStr.length() > longestString.length()) {
                        longestString = currentStr;
                    }
                }
                continue;
            } else {
                String currentStr = getStringFromSet(set);

                if (currentStr.length() > longestString.length()) {
                    longestString = currentStr;
                }
                set = new LinkedHashSet<Character>(input.charAt(i));
            }

        }

        return longestString;
    }

    private static String getStringFromSet(Set<Character> set) {

        Object[] charArr = set.toArray();

        StringBuffer strBuff = new StringBuffer();
        for (Object obj : charArr) {
            strBuff.append(obj);

        }

        return strBuff.toString();
    }
}

