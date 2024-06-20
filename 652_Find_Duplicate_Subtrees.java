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
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> result = new ArrayList<>();
        traverse(root, new HashMap<>(), new HashMap<>(), result);
        return result;
    }
    public int traverse(TreeNode node, HashMap<String, Integer> tripletToId, HashMap<Integer, Integer> cnt, List<TreeNode> result){
        if(node == null) return 0;
        String triplet = traverse(node.left, tripletToId, cnt, result) + "," + node.val + "," +
                         traverse(node.right, tripletToId, cnt, result);
        tripletToId.putIfAbsent(triplet, tripletToId.size() + 1);
        int id = tripletToId.get(triplet);
        cnt.put(id, cnt.getOrDefault(id,0) + 1);
        if(cnt.get(id) == 2){
            result.add(node);
        }
        return id;
    }
    //TC - O(n), n = no. of nodes
    //SC - O(n)


    /**
        public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> result = new ArrayList<>();
        traverse(root, new HashMap<>(), result);
        return result;
    }

    public String traverse(TreeNode root, HashMap<String,Integer> cnt, List<TreeNode> result){
        if(root == null) return "";
        String representation = "(" + traverse(root.left, cnt, result) + ")" + root.val + "(" +
                                traverse(root.right, cnt, result) + ")";
        cnt.put(representation, cnt.getOrDefault(representation, 0 )+1);
        if(cnt.get(representation) == 2){
            result.add(root);
        }
        return representation;
    }
    //TC - O(n ^ 2), n = no. of nodes
    //SC - O(n ^ 2)
     */
}
