public class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x){
        val = x;
    }
}

class BSTree{
    TreeNode root = null;

    public TreeNode searchBST(TreeNode root, int val){
        if(root == null || root.val == val) return root;
        return val < root.val ? searchBST(root.left,val) : searchBST(root.right,val);
    }

    public TreeNode insertIntoBST(TreeNode root, int val){
        if(root == null) return new TreeNode(val);
        if(val > root.val){
            root.right = insertIntoBST(root.right,val);
        } else if(root.val == val){
            return root;
        } else {
            root.left = insertIntoBST(root.left,val);
        }
        return root;
    }

    public TreeNode deleteNode(TreeNode root, int key){
        if(root == null) return null;

        if(key > root.val){
            root.right = deleteNode(root.right,key);
        } else if(key < root.val){
            root.left = deleteNode(root.left,key);
        } else{
            if(root.left == null && root.right == null){
                root = null;
            }
            else if(root.right != null){
                root.val = successor(root);
                root.right = deleteNode(root.right,key);

            } else{
                root.val = predeccesor(root);
                root.left = deleteNode(root.left,key);
            }
        }
        return root;
    }

    public int successor(TreeNode root){
        root = root.right;
        while(root.left != null){
            root = root.left;
        }
        return root.val;
    }

    public int predeccesor(TreeNode root){
        root = root.left;
        while(root.right != null){
            root = root.right;
        }
        return root.val;
    }
}

class Bucket {
    private BSTree tree;
    public Bucket(){
        tree = new BSTree();
    }

    public void insert(Integer key){
        this.tree.root = this.tree.insertIntoBST(this.tree.root,key);
    }

    public void delete(Integer key){
        this.tree.root = this.tree.deleteNode(this.tree.root,key);
    }

    public boolean exists(Integer key){
        TreeNode node = this.tree.searchBST(this.tree.root,key);
        return (node != null);
    }
}

class MyHashSet {
    private Bucket[] bucketArray;
    private int keyRange;

    public MyHashSet() {
        this.keyRange = 769;
        this.bucketArray = new Bucket[this.keyRange];
        for(int i=0;i< this.keyRange;i++){
            this.bucketArray[i] = new Bucket();
        }
    }

    protected int _hash(int key){
        return (key % this.keyRange);
    }
    
    public void add(int key) {
        int bucketIndex = _hash(key);
        this.bucketArray[bucketIndex].insert(key);
    }
    
    public void remove(int key) {
        int bucketIndex = _hash(key);
        this.bucketArray[bucketIndex].delete(key);
    }
    
    public boolean contains(int key) {
        int bucketIndex = _hash(key);
        return this.bucketArray[bucketIndex].exists(key);
    }
}

//TC - O(log n/k), n = no. of all possible values, k = no. of predefined buckets, which is 769
//SC - (k + m), k = no. of predefined buckets, m = no. of unique values inserted into HashSet

/**
Approach-1 : Using LinkedList

class Bucket {
    private LinkedList<Integer> container;
    public Bucket(){
        container = new LinkedList<Integer>();
    }

    public void insert(Integer key){
        int index = this.container.indexOf(key);
        if(index == -1){
            this.container.addFirst(key);
        }
    }

    public void delete(Integer key){
        this.container.remove(key);
    }

    public boolean exists(Integer key){
        int index = this.container.indexOf(key);
        return (index != -1);

    }
}

class MyHashSet {
    private Bucket[] bucketArray;
    private int keyRange;

    public MyHashSet() {
        this.keyRange = 769;
        this.bucketArray = new Bucket[this.keyRange];
        for(int i=0;i< this.keyRange;i++){
            this.bucketArray[i] = new Bucket();
        }
    }

    protected int _hash(int key){
        return (key % this.keyRange);
    }
    
    public void add(int key) {
        int bucketIndex = _hash(key);
        this.bucketArray[bucketIndex].insert(key);
    }
    
    public void remove(int key) {
        int bucketIndex = _hash(key);
        this.bucketArray[bucketIndex].delete(key);
    }
    
    public boolean contains(int key) {
        int bucketIndex = _hash(key);
        return this.bucketArray[bucketIndex].exists(key);
    }
}

//TC - O(n/k), n = no. of all possible values & k = no. of predefined buckets (which is 769)
//SC - O(k + m), k = predefined buckets & m = no. of unique values inserted into HashSet

 */

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
