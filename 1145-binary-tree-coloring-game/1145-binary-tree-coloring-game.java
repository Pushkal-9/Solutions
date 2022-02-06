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
    public boolean btreeGameWinningMove(TreeNode root, int n, int x) {
        TreeNode node=findNode(root,x);
        int left=count(node.left);
        int right=count(node.right);
        
        if((n-1-left-right)>(1+left+right)){
            return true;
        }
        
        if(left>(n-left)){
            return true;
        }
        
        if(right>(n-right)){
            return true;
        }
        
        return false;
    }
    
    public int count(TreeNode node){
        if(node==null){
            return 0;
        }
        
        return 1+count(node.left)+count(node.right);
    }
    
    public TreeNode findNode(TreeNode root,int x){
        if(root==null){
            return root;
        }
        
        if(root.val==x){
            return root;
        }
        TreeNode left=findNode(root.left,x);
        if(left!=null){
            return left;
        }
        
        return findNode(root.right,x);
    }
}