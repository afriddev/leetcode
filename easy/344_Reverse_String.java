class Solution {
    public void reverseString(char[] s) {
        int l = 0;
        int r = s.length - 1;

        for (l = 0; l < s.length/2; l++) {
            char t = s[l];
            s[l] = s[r];
            s[r] = t;
            r--;
        }

    }
}
