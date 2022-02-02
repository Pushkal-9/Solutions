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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list=new ArrayList<>();
        TreeNode res=inOrder(root,k,list);
        
        return list.get(k-1);
    }
    
    public TreeNode inOrder(TreeNode root,int k,List<Integer> list){
        if(root==null){
            return root;
        }
        
        if(list.size()==k){
            return root;
        }
        
        if(inOrder(root.left,k,list)!=null){
            return root;
        }
        list.add(root.val);
        return inOrder(root.right,k,list);
        
    }
}