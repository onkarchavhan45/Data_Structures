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

/* Let's consider an example with the string s = "abcabcbb":

Start with i = 0, j = 0, and max = 0.
Iterate through the string:
1)
j = 0, character is 'a':
'a' is not in the HashSet. Add 'a'.
Update max = 1.
2)
j = 1, character is 'b':
'b' is not in the HashSet. Add 'b'.
Update max = 2.
3)
j = 2, character is 'c':
'c' is not in the HashSet. Add 'c'.
Update max = 3.
4)
j = 3, character is 'a':
'a' is already in the HashSet. Remove 'a' (from i = 0), increment i to 1.
Now, add 'a' (from j = 3).
5)
j = 4, character is 'b':
'b' is already in the HashSet. Remove 'b' (from i = 1), increment i to 2.
Now, add 'b' (from j = 4).
6)
Continue this process until the end of the string */