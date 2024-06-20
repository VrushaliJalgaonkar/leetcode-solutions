class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null;

        if(key > root.val){
            root.right = deleteNode(root.right,key);
        } else if(key < root.val){
            root.left = deleteNode(root.left,key);
        } else {
            //leaf node
            if(root.left == null && root.right == null){
                root = null;
            }
            //has right child
            else if(root.right != null){
                root.val = successor(root);
                root.right = deleteNode(root.right,root.val);
            } 
            //has left child
            else {
                root.val = predecessor(root);
                root.left = deleteNode(root.left,root.val);
            }
        }
        return root;
    }

    public int successor(TreeNode root){
        root = root.right;
        while(root.left != null) root = root.left;
        return root.val;
    }

    public int predecessor(TreeNode root){
        root = root.left;
        while(root.right != null) root = root.right;
        return root.val;
    }
}
//TC - O(log n)
//SC - O(H) to keep the recursion stack, where HHH is a tree height. H=log⁡NH = \log NH=logN for the balanced tree.
