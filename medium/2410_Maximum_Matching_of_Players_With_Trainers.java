class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int result = 0;
        int left = 0;
        int right = 0;

        while (left < players.length && right < trainers.length) {
            if (players[left] <= trainers[right]) {
                left++;
                result++;
            }
            right++;

        }

        return result;
    }
}
