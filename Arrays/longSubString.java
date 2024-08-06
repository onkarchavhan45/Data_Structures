package DSA.Data_Structures;

import java.util.HashSet;

public class longSubString {
    public static void main(String[] args) {
        String s="abcabcbb";
        lengthOfLongestSubstring(s);

    }
    
    static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;
        HashSet<Character> hs = new HashSet<>();
        int i = 0, j = 0, max = 0;
        while (j < s.length()) {
            if (!hs.contains(s.charAt(j))) {
                hs.add(s.charAt(j));
                max = Math.max(max, j - i + 1);
                j++;
            } else {
                hs.remove(s.charAt(i));
                i++;
            }
        }
        return max;
    }
}