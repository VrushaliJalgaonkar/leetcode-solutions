class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<list1.length;i++){
            map.put(list1[i],i);
        }
        List<String> result = new ArrayList<>();
        int minSum = Integer.MAX_VALUE, sum;
        for(int j=0;j<list2.length && j <= minSum;j++){
            if(map.containsKey(list2[j])){
                sum = j + map.get(list2[j]);
                if(sum < minSum){
                    result.clear();
                    result.add(list2[j]);
                    minSum = sum;
                } else if(sum == minSum){
                    result.add(list2[j]);
                }
            }
        }
        return result.toArray(new String[result.size()]);
    }
    //TC - O(l1 + l2), where l1 = list1 length, l2 = list2 length
    //SC - O(l1 * x), x = average string length

    /**
    //Approach - 1:
        public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<Integer,List<String>> map = new HashMap<>();
        for(int i=0;i<list1.length;i++){
            for(int j=0;j<list2.length;j++){
                if(list1[i].equals(list2[j])){
                    if(!map.containsKey(i+j)){
                        map.put(i+j,new ArrayList<String>());
                    }
                    map.get(i+j).add(list1[i]);
                }
            }
        }
        int minIndexSum = Integer.MAX_VALUE;
        for(int key : map.keySet()){
            minIndexSum = Math.min(minIndexSum,key);
        }
        String[] result = new String[map.get(minIndexSum).size()];
        return map.get(minIndexSum).toArray(result);
    }
    //TC - O(l1 * l2 * x) & SC = O(l1 * l2 * x), 
    //where l1 = list1 length, l2 - list2 length, x = average string length 
     */
}
