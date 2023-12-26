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
    public boolean isValidBST(TreeNode root) {
        long min=Long.MIN_VALUE;
        long max=Long.MAX_VALUE;
        
        return BST(root,min,max);
        
    }
    
    public boolean BST(TreeNode root, long min, long max){
        if(root==null){
            return true;
        }
        
        if(root.val<=min || root.val>=max){
            return false;
        }
        
        return BST(root.left,min,root.val) && BST(root.right,root.val,max);        
    }
}