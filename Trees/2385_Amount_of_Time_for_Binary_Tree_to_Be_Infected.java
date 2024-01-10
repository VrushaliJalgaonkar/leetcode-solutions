// Link : https://leetcode.com/problems/amount-of-time-for-binary-tree-to-be-infected/
// Last Practice on : 10-Jan-2024

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
    
    //Approach-2: One-pass DFS
    int maxDistance = 0;
    public int amountOfTime(TreeNode root, int start) {
        traverse(root, start);
        return maxDistance;
    }

    public int traverse(TreeNode root, int start){
        int depth = 0;
        if(root == null) return depth;
        int leftDepth = traverse(root.left, start);
        int rightDepth = traverse(root.right, start);
        if(root.val == start){
            maxDistance = Math.max(leftDepth, rightDepth);
            depth = -1;
        } else if(leftDepth>= 0 && rightDepth>= 0){
            depth = Math.max(leftDepth, rightDepth) + 1;
        } else {
            int distance = Math.abs(leftDepth) + Math.abs(rightDepth);
            maxDistance = Math.max(maxDistance, distance);
            depth = Math.min(leftDepth, rightDepth) - 1;
        }
        return depth;
    }

    //TC - O(n), DFS costs O(n) as we visit each node exactly once
    //SC - O(n)



/*
    //Approach - 1: Convert to graph and BFS
    public int amountOfTime(TreeNode root, int start) {
        Map<Integer, Set<Integer>> map = new HashMap<>();
        // parent = 0, because root's parent is 0
        convert(root, 0, map);
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        int minute = 0;
        Set<Integer> visited = new HashSet<>();
        visited.add(start);
        minute = bfs(queue, visited, minute, map);
        return minute - 1;
    }

    public int bfs(Queue<Integer> queue, Set<Integer> visited , int minute, Map<Integer, Set<Integer>> map){
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            while(levelSize > 0){
                int current = queue.poll();
                for(int num : map.get(current)){
                    if(!visited.contains(num)){
                        visited.add(num);
                        queue.add(num);
                    }
                }
                levelSize--;
            }
            minute++;
        }
        return minute;
    }

    //converting tree to graph
    public void convert(TreeNode current, int parent, Map<Integer, Set<Integer>> map){
        if(current == null) return;
        if(!map.containsKey(current.val)){
            map.put(current.val, new HashSet<>());
        }
        Set<Integer> adjacentList = map.get(current.val);
        if(parent != 0){
            adjacentList.add(parent);
        }
        if(current.left != null){
            adjacentList.add(current.left.val);
        }
        if(current.right != null){
            adjacentList.add(current.right.val);
        }
        convert(current.left, current.val, map);
        convert(current.right, current.val, map);
    }

    //TC - O(n), convert() takes O(n) time and bfs() taken O(n) time bcoz we visit a node only once
    //SC - O(n), map, queue and visited set require O(n) space

    */
}
