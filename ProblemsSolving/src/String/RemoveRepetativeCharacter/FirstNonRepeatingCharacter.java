package String.RemoveRepetativeCharacter;

import java.util.HashMap;
import java.util.Scanner;


/**
 * to find out the first non repeating character inside the string
 * ex   -
 * input   -   aaabcccdeeef
 * output  -   b
 */
public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FirstNonRepeatingCharacter obj = new FirstNonRepeatingCharacter();
        String str = scanner.next();
        char c = obj.UsingHashMap(str);
        System.out.println(c);
        char c1 = obj.withOutAnyUtils(str);
        System.out.println(c1);
    }

    public Character UsingHashMap(String str) {
        char[] charArr = str.toCharArray();
        HashMap<Character, Boolean> map = new HashMap<Character, Boolean>();
        for (char c : charArr) {
            if (map.containsKey(c)) {
                map.put(c, false);
            } else {
                map.put(c, true);
            }
        }
        for (Character c : map.keySet()) {
            if (map.get(c)) {
                return c;
            }
        }

        return '-';
    }

    /**
     * Without using hashMap
     *
     * @param str
     * @return
     */
    public Character withOutAnyUtils(String str) {
        int[] alphabets = new int[26];
        char[] charArr = str.toCharArray();
        for (char c : charArr) {
            // subtracting with a index i.e. 97
            alphabets[c - 'a']++;
        }

        for (int i : alphabets) {
            if (i == 1) {
                char c = (char) (i + 97);
                return c;
            }
        }
        return '-';
    }
}
