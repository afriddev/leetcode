
/**
 * Beats : 100%
 * time : 0ms
 * time complexity : O(N) // O(M + N)
 * 
 */

class Solution {
    public static boolean isSubsequence(String s, String t) {

        if (s.length() == 0) {
            return true;
        }
        if (t.length() == 0 && s.length() != 0) {
            return false;
        }
        if (t.length() == 0 && s.length() == 0) {
            return true;
        }
        if (t.length() < s.length()) {
            return false;
        }
        if (t.contains(s)) {
            return true;
        }

        int index = 0;
        for (int i = 0; i < s.length(); i++) {

            if (index >= s.length() - 1) {
                if (t.substring(index, t.length()).length() < s.substring(i, s.length()).length()) {
                    return false;
                }
            }
            if (t.substring(index, t.length()).contains(String.valueOf(s.charAt(i)))) {
                index = index + t.substring(index, t.length()).indexOf(String.valueOf(s.charAt(i))) + 1;

            } else {
                return false;
            }

        }

        return true;

    }
}
