class RandomizedSet {
    HashSet<Integer> hashSet = new HashSet<>();
    ArrayList<Integer> list = new ArrayList<>();
    Random random = new Random();
    public RandomizedSet() {
    }
    public boolean insert(int val) {
        if (!hashSet.contains(val)) {
            hashSet.add(val);
            list.add(val);
            return true;
        }
        return false;
    }
    public boolean remove(int val) {
        if (hashSet.contains(val)) {
            hashSet.remove(val);
            list.remove(list.indexOf(val));
            return true;
        }
        return false;
    }
    public int getRandom() {
        return list.get(random.nextInt(hashSet.size()));
    }
}
