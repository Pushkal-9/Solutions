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
    public int pathSum(TreeNode root,int targetSum){
        if(root==null){
            return 0;
        }
        
        return nodeSum(root,targetSum,0,0)+ pathSum(root.left,targetSum)+pathSum(root.right,targetSum);
    }
    
    public int nodeSum(TreeNode root,int targetSum,int k,int res) {
        if(root==null){
            return res;
        }
        
        int t=k+root.val;
        int r=res;
        if(t==targetSum){
            r=res+1;
        }
        
        int l=nodeSum(root.left,targetSum,t,r);
        int ri=nodeSum(root.right,targetSum,t,r);
        
        return l + ri-r;
    }
}