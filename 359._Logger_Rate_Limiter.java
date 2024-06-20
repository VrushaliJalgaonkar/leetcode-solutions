class Logger {
    //Approach-2 : Using HashMap
    private HashMap<String,Integer> expiry;
    private int TIMEOUT = 10;

    public Logger() {
        expiry = new HashMap<String,Integer>();
    }
    
    public boolean shouldPrintMessage(int timestamp, String message) {
        if(expiry.containsKey(message) && expiry.get(message) > timestamp){
            return false;
        }
        expiry.put(message,timestamp + TIMEOUT);
        return true;
    }
}
//TC - O(1) & SC - O(n)

/**
//Approach-1 : Using Queue & Set
    class Pair<U,V>{
    public U first;
    public V second;
    public Pair(U first, V second){
        this.first = first;
        this.second = second;
    }
}

class Logger {
    private LinkedList<Pair<String,Integer>> msgQueue;
    private HashSet<String> msgSet;

    public Logger() {
        msgQueue = new LinkedList<Pair<String,Integer>>();
        msgSet = new HashSet<String>();
    }
    
    public boolean shouldPrintMessage(int timestamp, String message) {
        while(msgQueue.size() > 0){
            Pair<String,Integer> head = msgQueue.getFirst();
            if(timestamp - head.second >= 10){
                msgQueue.removeFirst();
                msgSet.remove(head.first);
            } else{
                break;
            }
        }

        if(!msgSet.contains(message)){
            Pair<String,Integer> newEntry = new Pair<String,Integer>(message,timestamp);
            msgQueue.addLast(newEntry);
            msgSet.add(message);
            return true;
        } else {
            return false;
        }
    }
    //TC - O(n)
    //SC - O(n)
}

 */
/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */
