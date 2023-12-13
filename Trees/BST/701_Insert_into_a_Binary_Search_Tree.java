class Solution {
    //Iterative approach
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode node = root;
        while(node != null){
            if(val > node.val){
                if(node.right == null){
                    node.right = new TreeNode(val);
                    return root;
                }
                else node = node.right;

            } else {
                if(node.left == null){
                    node.left = new TreeNode(val);
                    return root;
                }
                else node = node.left;
            }
        }
        return new TreeNode(val);
    }
    //TC - O(H), H = tree height, Avg case - O(log n), worst case - O(n)
    //SC - O(1)

    /**
    Recursion

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null) return new TreeNode(val);
        if(val < root.val) root.left = insertIntoBST(root.left,val);
        else root.right = insertIntoBST(root.right,val);
        return root;
    }
    //TC - O(H), H = tree height, Avg case - O(log n), worst case = O(n)
    //SC - O(H), H = tree height, Avg case - O(log n), worst case = O(n)
     */
    
}
