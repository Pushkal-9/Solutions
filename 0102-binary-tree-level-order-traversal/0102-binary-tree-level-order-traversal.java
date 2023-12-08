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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        
        if(root==null){
            
        }
        
        queue.add(root);
        queue.add(null);
        
        List<Integer> level = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
                if(root==null){
            return res;
        }
        while(!queue.isEmpty()){
            TreeNode node = queue.remove();

            if(node==null && !queue.isEmpty()){
                res.add(level);
                level = new ArrayList<>();
                queue.add(null);
            }
            else if(node==null && queue.isEmpty()){
                                res.add(level);

                break;
            }
            else{
                level.add(node.val);
                if(node.left!=null){
                queue.add(node.left);}
                if(node.right!=null){
                queue.add(node.right);}
            }
        }
        return res;
    }
}