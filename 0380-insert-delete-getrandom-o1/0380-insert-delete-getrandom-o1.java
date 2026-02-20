class RandomizedSet {
    List<Integer> list;
    Set<Integer> set;
    Random rd;
    public RandomizedSet() {
        list = new ArrayList<>();
        set = new HashSet<>();
        rd = new Random();
    }
    
    public boolean insert(int val) {
        if(!set.contains(val)) list.add(val);
        return set.add(val);
    }
    
    public boolean remove(int val) {
        if(set.contains(val)) list.remove((Integer)val);
        return set.remove(val);
    }
    
    public int getRandom() {
        return list.get(rd.nextInt(list.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */