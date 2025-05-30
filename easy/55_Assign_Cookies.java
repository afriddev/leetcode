class Solution {
    public int findContentChildren(int[] g, int[] s) {
        if(s.length == 0 || g.length == 0) return 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int result = 0;
        int j = 0;
        int l = 0;
        while (l < g.length) {
            if (s[j] >= g[l]) {
                result++;
                l++;
            }
            j++;
            if (j == s.length)
                break;
        }
        return result;
    }
}
