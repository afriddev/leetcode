class Solution {
    public static int lengthOfLongestSubstring(String s) {
        LinkedHashSet<Character> subStringSet = new LinkedHashSet<>();
        ArrayList<Integer> seta = new ArrayList<>();
        int index = 0;
        for (char a : s.toCharArray()) {
            for (char b : s.substring(index, s.length()).toCharArray()) {
                if (!subStringSet.contains(b)) {
                    subStringSet.add(b);
                } else {
                    seta.add(subStringSet.size());
                    subStringSet.clear();
                    break;
                }
            }
            seta.add(subStringSet.size());
            subStringSet.clear();
            index++;
        }
        int result = 0;
        for (int i = 0; i < seta.size(); i++) {
            if (seta.get(i) > result) {
                result = seta.get(i);
            }
        }
        return result;
    }

}
