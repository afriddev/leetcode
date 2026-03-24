class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] freq = new int[26];
        for (char s:sentence.toCharArray()) freq[s - 'a']++;
        for(int i = 0;i < 26;i++){
            if(freq[i] == 0 ) return false;
        }
        return true;
    }

}
