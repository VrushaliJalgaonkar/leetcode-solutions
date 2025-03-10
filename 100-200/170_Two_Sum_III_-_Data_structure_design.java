class TwoSum {

    //Approach-2 : HashTable
    private HashMap<Integer,Integer> nums;
    
    public TwoSum() {
        this.nums = new HashMap<>();
    }
    
    public void add(int number) {
        this.nums.put(number,this.nums.getOrDefault(number,0)+1);
    }
    
    public boolean find(int value) {
        for(Map.Entry<Integer,Integer> entry : this.nums.entrySet()){
            int complement = value - entry.getKey();
            if(complement != entry.getKey()){
                if(this.nums.containsKey(complement)){
                    return true;
                }
            } else {
                if(entry.getValue() > 1){
                    return true;
                }
            }
        }
        return false;    
    }
    //TC - add() - O(1), find() - O(n)
    //SC - O(n)



    /**
        //Approach-1 : Sorted list
    private ArrayList<Integer> nums;
    private boolean isSorted;

    public TwoSum() {
        this.nums = new ArrayList<Integer>();
        this.isSorted = false;
    }
    
    public void add(int number) {
        this.nums.add(number);
        this.isSorted = false;
        
    }
    
    public boolean find(int value) {
        if(!this.isSorted){
            Collections.sort(this.nums);
            this.isSorted = true;
        }
        int low = 0, high = this.nums.size() - 1;
        while(low < high){
            int twoSum = this.nums.get(low) + this.nums.get(high);
            if(twoSum < value){
                low++;
            } else if(twoSum > value){
                high--;
            } else {
                return true;
            }
        }
        return false;
    }
    //TC : add() - O(1), find() - O(n log(n))
    //SC : O(n)
     */
}

/**
 * Your TwoSum object will be instantiated and called as such:
 * TwoSum obj = new TwoSum();
 * obj.add(number);
 * boolean param_2 = obj.find(value);
 */
