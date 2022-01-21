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
    ArrayList<List<Integer>> list=new ArrayList<>();
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        bfs(root,height(root));
        return list;
    }
    
    public void bfs(TreeNode root,int h){
        
        for(int i=1;i<=h;i++){
           ArrayList<Integer>li=new ArrayList<>(); 
            if(i%2==1){
                evenLevelOrder(root,i,li);
            }
            else{
                oddLevelOrder(root,i,li);
            }
            list.add(li);
        }
    }
    
    
    public void evenLevelOrder(TreeNode node,int l,List<Integer> list){
        if(node==null){
            return;
        }
        if(l==1){
            list.add(node.val);
        }
            evenLevelOrder(node.left,l-1,list);
            evenLevelOrder(node.right,l-1,list);
        
    }
    
    public void oddLevelOrder(TreeNode node,int l,List<Integer> list){
        if(node==null){
            return;
        }
        if(l==1){
            list.add(node.val);
        }
        if(l>1){
            oddLevelOrder(node.right,l-1,list);
            oddLevelOrder(node.left,l-1,list);
        }
    }
    
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        
        int lh=height(root.left);
        int rh=height(root.right);
        
        return 1+ Math.max(lh,rh);
    }
}