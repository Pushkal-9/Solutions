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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        
        if(root==null){
            return res;
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        
        queue.add(root);
        queue.add(null);
        
        while(!queue.isEmpty()){
            if(queue.peek()==null){
                queue.poll();
                if(queue.isEmpty()){
                    break;
                }
                else{
                    queue.add(null);
                }
            }
            else{
                TreeNode node = queue.poll();
                if(queue.peek()==null){
                    res.add(node.val);
                }
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
            }
        }
        
        return res;
    }
}