package Day_74_Minimum_Depth_Binary_Tree;

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
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null)
            return Math.min(Integer.MAX_VALUE, minDepth(root.right)) + 1;
        else if(root.right == null)
            return Math.min(minDepth(root.left), Integer.MAX_VALUE) + 1;
        else
            return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }
}