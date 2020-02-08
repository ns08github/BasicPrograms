package String.RemoveRepetativeCharacter;


import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveRepetitiveCharacter {
    public static void main(String[] args) {
        RemoveRepetitiveCharacter obj = new RemoveRepetitiveCharacter();
        obj.solution1("NidhI");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String result = obj.solution2(str);
        System.out.println(result);
    }

    /* @author- Nidhi Solnaki
     * this solution for repetitive Upper case
     * ex- NidhI
     * */
    public void solution1(String name) {
        int i = 0, j = 0, count;
        char ch;
        String nm = "";
        System.out.println("len: " + name.length());
        for (i = 0; i < name.length(); i++) {
            count = 0;
            for (j = 0; j < name.length(); j++) {
                if (name.charAt(i) == name.charAt(j)) {
                    count++;
                }
            }
            if (!(count > 1)) {
                nm += name.charAt(i);
            }
        }
        System.out.println("nm= " + nm + " actual string: " + name);
    }

    /**
     *
     * @param str
     * @return
     */
    public String solution2(@NotNull String str) {
        StringBuilder finalStr = new StringBuilder();
        // create hashSet for adding non repetitive character
        HashSet<Character> set = new HashSet();
        /* Fetch length */
        int n = str.length()-1;
        while (n >= 0) {
            char c = Character.toLowerCase(str.charAt(n));
            if(set.contains(c)){
                set.remove(c);
            }else{
                set.add(c);
            }
            n--;
        }
        for (char c:set){
            finalStr.append(c);
        }
        return finalStr.reverse().toString();
    }

}