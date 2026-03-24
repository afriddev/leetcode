class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for(int i = 0; i< sentences.length;i++){
            String[] parts = sentences[i].split(" ");
            if(parts.length > max) max = parts.length;
        }
        return max;
    }
}
