class Solution {
    //iterative approach
    public TreeNode searchBST(TreeNode root, int val) {
        while(root != null && val != root.val){
            root = val < root.val ? root.left : root.right;
        }
        return root;
    }
    //TC - O(H), H = tree height, Avg case - O(log n), worst case - O(n)
    //SC - O(1)


    /**
    Recursion
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null || root.val == val) return root;
        return val < root.val ? searchBST(root.left,val) : searchBST(root.right,val);
    }
    //TC - O(H), H = tree height. Avg case = O(log n) & worst case = O(n)
    //SC - O(H), H = tree height. Avg case = O(log n) & worst case = O(n)
     */
}
