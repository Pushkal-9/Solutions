/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n=mountainArr.length()-1;
        int peak= peak(mountainArr,0,n);
        if(mountainArr.get(peak)==target){
            return peak;
        }
        
        int i=decSearch(mountainArr,0,peak-1,target);
        int j=incSearch(mountainArr,peak+1,n,target);
        
        if(i!=-1){
            return i;
        }
        
        //System.out.println(i);
        
        return j;
        
    }
    
    public int decSearch(MountainArray arr,int low,int high,int target){
        int mid=0;
        while(low<=high){
        mid=(high-low)/2 +low;
        if(low>high){
            return -1;
        }
        int k=arr.get(mid);
        
        if(k==target){
            return mid;
        }
        
        else if(k>target){
            high=mid-1;
        }
        else{
            low=mid+1;
        }
        }
        return -1;
    }
    
    public int incSearch(MountainArray arr,int low,int high,int target){
        int mid=0;
        while(low<=high){
        mid=(high-low)/2 +low;
        if(low>high){
            return -1;
        }
        int k=arr.get(mid);
        
        if(k==target){
            return mid;
        }
        
        else if(k<target){
            high=mid-1;
        }
        else{
            low=mid+1;
        }
        }
        return -1;
    }
    
    public int peak(MountainArray arr,int low,int high){
        int mid=0;
        while(low<high){
        mid=(high-low)/2 +low;
        int k=arr.get(mid);
        // int prev=arr.get(mid-1);
        // int next=arr.get(mid+1);
        if(mid-1>=0 && mid+1<arr.length() && k>arr.get(mid-1) && k>arr.get(mid+1)){
            return mid;
        }
        else if(mid-1>=0 && mid+1<arr.length() && arr.get(mid-1)<k && k<arr.get(mid+1)){
            low=mid+1;
        }
        else{
            high=mid-1;
        }
        }
        
        return low;
    }
}