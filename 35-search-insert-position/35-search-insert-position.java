class Solution {
    public int searchInsert(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        
        int mid=0;
        
        
        while(low<=high){
            mid=(high-low)/2 +low;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        
        if(nums[mid]<target)
        return mid+1;
        
        
        return mid;
    }
}