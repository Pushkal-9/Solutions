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
    ArrayList<Integer> list=new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        TreeNode res=inOrder(root,k);
        
        return list.get(k-1);
    }
    
    public TreeNode inOrder(TreeNode root,int k){
        if(root==null){
            return root;
        }
        
        if(list.size()==k){
            return root;
        }
        
        if(inOrder(root.left,k)!=null){
            return root;
        }
        list.add(root.val);
        return inOrder(root.right,k);
        
    }
}