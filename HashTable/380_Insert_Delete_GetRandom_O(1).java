class RandomizedSet {
    Map<Integer,Integer> dict;
    List<Integer> list;
    Random rand = new Random();
    public RandomizedSet() {
        dict = new HashMap<>();
        list = new ArrayList<>();
    }
    
    public boolean insert(int val) {
        if(dict.containsKey(val)) return false;
        dict.put(val,list.size());
        list.add(list.size(),val);
        return true;
    }
    
    public boolean remove(int val) {
        if(!dict.containsKey(val)) return false;
        int lastElement = list.get(list.size() - 1);
        int index = dict.get(val);
        list.set(index,lastElement);
        dict.put(lastElement,index);
        list.remove(list.size() - 1);
        dict.remove(val);
        return true;
    }
    
    public int getRandom() {
        return list.get(rand.nextInt(list.size()));
    }
}

//TC : insert() - O(1), remove() - O(1), GetRandom() - O(1)
//SC - O(n)

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
