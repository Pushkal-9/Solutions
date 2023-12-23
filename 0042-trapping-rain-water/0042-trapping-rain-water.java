class Solution {
    public int trap(int[] height) {
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        
        for(int i=1; i<height.length; i++){
            left[i]=Math.max(left[i-1],height[i-1]);
        }
        
        
        for(int i=height.length-2; i>=0; i--){
            right[i]=Math.max(right[i+1],height[i+1]);
        }
        
        int count=0;
        
        for(int i=0;i<height.length;i++){
            if(Math.min(left[i],right[i])>height[i])
            {count= count + Math.min(left[i],right[i])-height[i];}
        }
        
        return count;
    }
}