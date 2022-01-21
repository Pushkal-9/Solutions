class Solution {
    public int search(int[] nums, int target) {
        int pivot=pivot(0,nums.length-1,nums);
        System.out.println(pivot);
        if(pivot==-1){
            return binarySearch(0,nums.length-1,nums,target);
        }
        System.out.println(pivot);
        int left=binarySearch(0,pivot,nums,target);
        int right=binarySearch(pivot+1,nums.length-1,nums,target);
        if(left!=-1){
            return left;
        }
        
        return right;
    }
    
    public int pivot(int low,int high,int arr[]){
        if(low>high){
            return -1;
        }
        
        if(low==high){
            return low;
        }
        int mid=(low+high)/2;
        if(mid!=high && arr[mid]>arr[mid+1]){
            return mid;
        }
        if(mid!=low && arr[mid] <arr[mid-1]){
            return mid-1;
        }
        if(arr[low]>=arr[mid]){
        return pivot(low,mid-1,arr);}
        return pivot(mid+1,high,arr);
    }
    
    public int binarySearch(int low,int high,int arr[],int target){
        
        if(low>high){
            return -1;
        }
        int mid=(high-low)/2 +low;
        
        if(arr[mid]==target){
            return mid;
        }
        
        else if(arr[mid]<target){
            return binarySearch(mid+1,high,arr,target);
        }
        else{
            return binarySearch(low,mid-1,arr,target);
        }
    }
}