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
    int pos=0;
    int ks=0;
    public int kthSmallest(TreeNode root, int k) {
        inOrder(root,k);
        return ks;
    }
    
    public void inOrder(TreeNode root, int k){
        
        if(root==null){
            return ;
        }
        
        inOrder(root.left,k);
        pos=pos+1;
        if(pos==k){
            ks= root.val;
            return;
        }
        inOrder(root.right,k);
    }
}