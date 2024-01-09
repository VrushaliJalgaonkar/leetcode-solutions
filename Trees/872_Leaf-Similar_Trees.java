/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> res1 = new ArrayList<>();
        ArrayList<Integer> res2 = new ArrayList<>();
        helper(root1, res1);
        helper(root2, res2);
        return res1.equals(res2);
    }
    void helper(TreeNode root, ArrayList<Integer> res){
        if(root == null) return;
        if(root.left == null && root.right == null){
            res.add(root.val);
        }
        helper(root.left, res);
        helper(root.right, res);
    }

    //TC - O(T1 + T2), T and T2 and lengths of given trees
    //SC - O(T1 + T2)
}
