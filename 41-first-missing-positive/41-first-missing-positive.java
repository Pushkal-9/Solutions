class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        for (int i = 0; i < nums.length; i++) {
        if (nums[i] <= 0 || nums[i] > nums.length) {
            nums[i] = nums.length + 1;
        }
    }
        
        for (int i = 0; i < nums.length; i++) {
        int num = Math.abs(nums[i]);
        if (num > nums.length) {
            continue;
        }
        num--;
        if (nums[num] > 0) { 
            nums[num] = -1 * nums[num];
        }
    }
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                return i+1;
            }
        }
        return nums.length+1;
        
//         HashSet<Integer> set=new HashSet<>();
        
        
//         for(int i=0;i<)
        
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]>0){
//             set.add(nums[i]);}
//         }
        
//         int num=1;
        
//         while(num>0){
//             if(!set.contains(num)){
//                 break;
//             }
//             num++;
//         }
        
//         return num;
    }
}