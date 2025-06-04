class Solution {
    public String getHint(String secret, String guess) {
        int cows = 0;
        int bulls = 0;
        ArrayList<Character> a = new ArrayList<>();
        ArrayList<Character> b = new ArrayList<>();

        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i))
                cows++;
            else {
                a.add(secret.charAt(i));
                b.add(guess.charAt(i));
            }
        }

        for (int i = 0; i < b.size(); i++) {
            if (a.contains(b.get(i))) {
                bulls++;
                a.remove(b.get(i));
            }
        }

        return Integer.toString(cows) + "A" + Integer.toString(bulls) + "B";

    }
}
