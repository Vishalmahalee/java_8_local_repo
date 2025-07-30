package com.learnstreamapi.NUMBER;
//Given a string, write a function that returns the longest substring without repeating characters.
//Example: For the input string "abcabcbb", the output should be "abc", with a length of 3.
import java.util.*;

public class LongestSubstring {
    public static String longestUniqueSubstring(String s) {
        int start = 0;
        int maxLen = 0;
        int maxStart = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int end = 0; end < s.length(); end++) {
            char ch = s.charAt(end);

            if (map.containsKey(ch) && map.get(ch) >= start) {
                start = map.get(ch) + 1;
            }

            map.put(ch, end);

            if (end - start + 1 > maxLen) {
                maxLen = end - start + 1;
                maxStart = start;
            }
        }

        return s.substring(maxStart, maxStart + maxLen);
    }

    public static void main(String[] args) {
        String input = "abcabcbb";
        String result = longestUniqueSubstring(input);
        System.out.println("Longest substring: " + result);
        System.out.println("Length: " + result.length());
    }
}

