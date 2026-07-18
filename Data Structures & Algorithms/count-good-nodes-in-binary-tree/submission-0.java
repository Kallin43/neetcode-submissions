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
    public int goodNodes(TreeNode root) {
        return dfs(root, root.val);
    }
    private int dfs(TreeNode node, int maxSoFar){
        int good = 0;
        if(node==null){
            return 0;
        }
        if(node.val>=maxSoFar){
            good++;
        }
        int newMax = Math.max(node.val, maxSoFar);
        int left = dfs(node.left, newMax);
        int right = dfs(node.right, newMax);
        return good + left + right;
    }
}
