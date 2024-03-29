package Day_83_Binary_Tree_Zigzag_Level_Order_Traversal;

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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null)
            return ans;
        Queue<TreeNode> nodesQueue = new LinkedList<>();
        nodesQueue.add(root);
        boolean rightToLeft = false;
        while (!nodesQueue.isEmpty()) {
            int size = nodesQueue.size();
            List<Integer> level = new ArrayList<>();
            while (size-- > 0) {
                TreeNode current = nodesQueue.remove();
                if (current.left != null)
                    nodesQueue.add(current.left);
                if (current.right != null)
                    nodesQueue.add(current.right);
                level.add(current.val);
            }
            if (rightToLeft)
                Collections.reverse(level);
            rightToLeft = !rightToLeft;
            ans.add(level);
        }
        return ans;
    }
}