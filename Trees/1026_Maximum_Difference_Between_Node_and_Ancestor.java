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

    //Approach-2 : Maximum minus Minimum
    public int maxAncestorDiff(TreeNode root) {
        if(root == null){
            return 0;
        }
        return helper(root, root.val, root.val);
    }
    public int helper(TreeNode node, int currMax, int currMin){
        if(node == null){
            return currMax - currMin;
        }
        currMax = Math.max(currMax, node.val);
        currMin = Math.min(currMin, node.val);
        int left = helper(node.left, currMax, currMin);
        int right = helper(node.right, currMax, currMin);
        return Math.max(left, right);
    }
    //TC - O(n), because visiting all nodes
    //SC - O(n), because of recursion stack

    /*
    //Approach-1 : Recursion
    int result = 0;

    public int maxAncestorDiff(TreeNode root) {
        if(root == null) return 0;
        helper(root, root.val, root.val);
        return result;
    }
    void helper(TreeNode node, int currMax, int currMin){
        if(node == null){
            return;
        }
        int possibleResult = Math.max(Math.abs(currMax - node.val), Math.abs(currMin - node.val));
        result = Math.max(result, possibleResult);
        currMax = Math.max(currMax, node.val);
        currMin = Math.min(currMin, node.val);
        helper(node.left, currMax, currMin);
        helper(node.right, currMax, currMin);
        return;
    }
    //TC - O(n), because visiting all nodes
    //SC - O(n), because of recursion stack
    */
}
