class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3){
            return false;
        }
        if(arr[0]==arr[1]){
            return false;
        }
        
        boolean inc=arr[0]<arr[1]?true:false;
        
        for(int i=1;i<arr.length-1;i++){
            if(arr[i-1]<arr[i]&& arr[i]>arr[i+1]){
                if(inc){
                inc=false;}
                else{
                    return false;
                }
                continue;
            }
            
            if(!inc && arr[i]<arr[i+1]){
                return false;
            }
            
            if(arr[i]==arr[i+1]){
                return false;
            }
        }
        if(arr[0]<arr[1]){
        return !inc;}
        
        return inc;
    }
}