//Link :https://leetcode.com/problems/moving-average-from-data-stream/description/
//Last Practice on : 26-Jan-2024

class MovingAverage {
    //Approach 2: Double-ended Queue
    int size, windowSum = 0, count = 0;
    Deque queue = new ArrayDeque<Integer>();
    public MovingAverage(int size) {
        this.size = size;
    }
    
    public double next(int val) {
        ++count;
        queue.add(val);
        int tail = count > size ? (int)queue.poll() : 0;
        windowSum = windowSum - tail + val;
        return windowSum * 1.0 / Math.min(size, count);
    }

    //TC - O(1)
    //SC - O(n), n is moving windowSize


    /*
        //Approach 1: Array or List
        int size;
        List<Integer> queue = new ArrayList<>();
        public MovingAverage(int size) {
            this.size = size;
        }
        
        public double next(int val) {
            queue.add(val);
            int windowSize = 0;
            for(int i = Math.max(0, queue.size() - size); i < queue.size(); i++){
                windowSize = windowSize + queue.get(i);
            }
            return windowSize * 1.0 / Math.min(queue.size(), size);
        }

        //TC - O(n), n is moving windowSize
        //SC - O(m), m = queue length
    */
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */
