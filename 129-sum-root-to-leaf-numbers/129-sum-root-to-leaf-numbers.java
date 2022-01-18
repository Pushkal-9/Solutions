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
    public int sumNumbers(TreeNode root) {
        int total=maxPath(root,0,0);
        
        return total;
    }
    
    public int maxPath(TreeNode root,int sum,int totalSum){
        if(root==null){
            return totalSum;
        }
        sum=sum*10+root.val;
        
        if(root.left==null && root.right==null){
            totalSum=totalSum+sum;
            return totalSum;
        }
        
        totalSum=maxPath(root.left,sum,totalSum);
        totalSum=maxPath(root.right,sum,totalSum);
        
        return totalSum;
    }
}