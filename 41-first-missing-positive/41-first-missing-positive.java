class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
            set.add(nums[i]);}
        }
        
        int num=1;
        
        while(num>0){
            if(!set.contains(num)){
                break;
            }
            num++;
        }
        
        return num;
    }
}