/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        
        if(root==null){
            return root;
        }
        
         if((root.val>=p.val && root.val<=q.val) || (root.val<=p.val && root.val>=q.val)){
            return root;
        }
        
        if(lowestCommonAncestor(root.left,p,q)!=null){
            return lowestCommonAncestor(root.left,p,q);
        }
        
        return lowestCommonAncestor(root.right,p,q);
        
        
    }
}