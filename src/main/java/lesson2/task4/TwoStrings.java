package lesson2.task4;

import java.util.Arrays;

public class TwoStrings {
    public static void main(String[] args) {
        TwoStrings twoStrings = new TwoStrings();
        System.out.println(twoStrings.searchForDuplicateCharacters("hello", "world"));
        System.out.println(twoStrings.searchForDuplicateCharacters("ping", "pong"));
        System.out.println(twoStrings.searchForDuplicateCharacters("qwer", "asdf"));
        System.out.println(twoStrings.searchForDuplicateCharacters("post", "get"));
    }

    String searchForDuplicateCharacters(String a, String b) {
        String c = "";
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                if (a.charAt(i) == b.charAt(j) && !c.contains(b.charAt(j) + ""))
                    c += a.charAt(i);
            }
        }
        char[] array = c.toCharArray();
        Arrays.sort(array);
        return new String(array);
    }
}