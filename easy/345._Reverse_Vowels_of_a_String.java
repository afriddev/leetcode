class Solution {
    public String reverseVowels(String s) {
        StringBuilder result = new StringBuilder(s);
        String clone = s.toLowerCase();
        int l = 0;
        int r = s.length() - 1;

        while (r>l) {

            if (clone.charAt(l) == 'a' || clone.charAt(l) == 'e' || clone.charAt(l) == 'i' || clone.charAt(l) == 'o'
                    || clone.charAt(l) == 'u') {

                if (clone.charAt(r) == 'a' || clone.charAt(r) == 'e' || clone.charAt(r) == 'i' || clone.charAt(r) == 'o'
                        || clone.charAt(r) == 'u') {
                    char t = s.charAt(l);
                    result.setCharAt(l, s.charAt(r));
                    result.setCharAt(r, t);
                    l++;
                    r--;
                } else {
                    r--;

                }

            } else {
                l++;
            }
        }
        return result.toString();
    }

}
