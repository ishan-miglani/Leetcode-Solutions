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
        List<Integer> leaf1 = new ArrayList<>();
        List<Integer> leaf2 = new ArrayList<>();
        leaf1 = helper(root1, new ArrayList<>());
        leaf2 = helper(root2, new ArrayList<>());
        
        return leaf1.equals(leaf2);
    }
    
    public List<Integer> helper(TreeNode root, List<Integer> list) {
        if(root == null)
            return list;
        if(root.left == null && root.right == null) {
            list.add(root.val);
        }
        helper(root.left,list);
        helper(root.right,list);
        return list;
    }
}