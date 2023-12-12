class BrowserHistory {
    ArrayList<String> visitedUrls;
    int currUrl, lastUrl;

    public BrowserHistory(String homepage) {
        visitedUrls = new ArrayList<String>(Arrays.asList(homepage));
        currUrl = lastUrl = 0;
    }
    
    public void visit(String url) {
        currUrl++;
        if(visitedUrls.size() > currUrl){
            visitedUrls.set(currUrl,url);
        } else {
            visitedUrls.add(url);
        }
        lastUrl = currUrl;
    }
    
    public String back(int steps) {
        currUrl = Math.max(0, currUrl - steps);
        return visitedUrls.get(currUrl);        
    }
    
    public String forward(int steps) {
        currUrl = Math.min(lastUrl,currUrl + steps);
        return visitedUrls.get(currUrl);
       
    }
    //TC - visited() - O(1), back() & forward() - O(1)
    //SC - O(l * n), where l = url strings


    /*
    Approach-2 : Using Doubly LL
    class DLLNode{
    public String data;
    public DLLNode prev, next;
    DLLNode(String url){
        data = url;
        prev = null;
        next = null;
    }
}

class BrowserHistory {
    private DLLNode head;
    private DLLNode curr;


    public BrowserHistory(String homepage) {
        head = new DLLNode(homepage);
        curr = head;
    }
    
    public void visit(String url) {
        DLLNode newNode = new DLLNode(url);
        curr.next = newNode;
        newNode.prev = curr;
        curr = newNode;
    }
    
    public String back(int steps) {
        while(steps > 0 && curr.prev != null){
            curr = curr.prev;
            steps--;
        }
        return curr.data;
    }
    
    public String forward(int steps) {
        while(steps > 0 && curr.next != null){
            curr = curr.next;
            steps--;
        }
        return curr.data;
    }
    //TC : visit() - O(1), back() & forward() - O(min(n,m))
    //SC - O(l * n), l = url strings
     */


    /*
    // Approach - 1 : Using stack

    private Stack<String> history, future;
    private String current;

    public BrowserHistory(String homepage) {
        history = new Stack<String>();
        future = new Stack<String>();
        current = homepage;
    }
    
    public void visit(String url) {
        history.push(current);
        current = url;
        future = new Stack<String>();
    }
    
    public String back(int steps) {
        while(steps > 0 && !history.empty()){
            future.push(current);
            current = history.pop();
            steps--;
        }
        return current;
    }
    
    public String forward(int steps) {
        while(steps > 0 && !future.empty()){
            history.push(current);
            current = future.pop();
            steps--;
        }
        return current;
    }
    //TC : For visit() - O(1), For back() & forward() - O(min(n,m))
    //SC - O(l * n), where l is the URL strings
     */
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
