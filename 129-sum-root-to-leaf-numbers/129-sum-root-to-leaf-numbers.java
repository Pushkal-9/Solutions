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
    int max=0;
    public int sumNumbers(TreeNode root) {
        int total=maxPath(root,"",max);
        
        return total;
    }
    
    public int maxPath(TreeNode root,String sum,int totalSum){
        if(root==null){
            return totalSum;
        }
        String newSum=sum+root.val;
        
        if(root.left==null && root.right==null){
            totalSum=totalSum+Integer.parseInt(newSum);
            return totalSum;
        }
        
        totalSum=maxPath(root.left,newSum,totalSum);
        totalSum=maxPath(root.right,newSum,totalSum);
        
        return totalSum;
    }
}