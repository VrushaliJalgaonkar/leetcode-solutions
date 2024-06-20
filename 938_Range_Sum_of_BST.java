// Link : https://leetcode.com/problems/range-sum-of-bst/
// Last Practice On : 8-Jan-2024

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
    public int rangeSumBST(TreeNode root, int low, int high) {
        int[] sum=new int[1];
        helper(root,low,high,sum);
        return sum[0];
    }
    void helper(TreeNode root, int low, int high,int[] sum){
        if(root==null)
            return;
        if(root.val>=low && root.val<=high)
            sum[0]=sum[0]+root.val;
        if(root.val>low)
            helper(root.left,low,high,sum);
        if(root.val<high)
            helper(root.right,low,high,sum);
    }

     //TC - O(N), SC - O(N)
}
