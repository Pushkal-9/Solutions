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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        
        if(sameTree(root,subRoot)){
            return true;
        }
        
        if(root==null){
            return false;
        }
        
        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
        
    }
    
    public boolean sameTree(TreeNode one, TreeNode two){
        if(one==null && two==null){
            return true;
        }
        
        if(one==null || two==null){
            return false;
        }
        
        return one.val==two.val && sameTree(one.left,two.left) && sameTree(one.right,two.right);
    }
}