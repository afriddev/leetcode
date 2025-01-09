class Solution {
    public int prefixCount(String[] words, String pref) {
        int count = 0;

        for (int index = 0; index < words.length; index++) {

            if (words[index].charAt(0) == pref.charAt(0)) {

                if(words[index].length() >= pref.length())

                if(pref.equals(words[index].substring(0,pref.length()))){
                    count++;
                }

            
            }

        }

        return count;
        
    }
}
