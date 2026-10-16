package SlidingWindow;

import java.util.HashSet;

/**
 * LongestSubstringWithoutRepeatingCharacters
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public static int maxLength(String s){

        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int maxLen = 0;

        for(int right = 0; right < s.length(); right++){
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));
            int currLen = right - left + 1;
            maxLen = Math.max(maxLen, currLen);
        }

        return maxLen;
    }
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(maxLength(s));

    }
}