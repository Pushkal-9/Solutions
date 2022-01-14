class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        backtrack(res,new ArrayList<>(),nums);
        
        return res;
        
    }
    
    public void backtrack(List<List<Integer>> list,List<Integer> temp,int [] nums){
        if(temp.size()==nums.length){
            list.add(new ArrayList<>(temp));
        }
        
        for(int i=0;i<nums.length;i++){
            if(!temp.contains(nums[i])){
                temp.add(nums[i]);
                backtrack(list,temp,nums);
                temp.remove(temp.size()-1);}
        }
    }
}