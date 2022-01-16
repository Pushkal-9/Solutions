class Solution {
    public boolean canReach(int[] arr, int start) {
        int n=arr.length;
        boolean[]vis=new boolean[n];
        boolean res=dfs(arr,vis,start,n);
        
        // for(int i=0;i<n;i++){
        //     if(arr[i]==0 && vis[i]){
        //         return true;
        //     }
        // }
        
        
        return res;
    }
    
    public boolean dfs(int[]arr,boolean[]vis,int i,int n){
        
        if(arr[i]==0){
            return true;
        }
        
        vis[i]=true;
        
        int[]row={arr[i],-arr[i]};
        
        boolean res=false;
        
        for(int k=0;k<2;k++){
            if(isSafe(i+row[k],vis,n)){
                res=res||dfs(arr,vis,i+row[k],n);
            }
        }
        
        return res;
    }
    
    public boolean isSafe(int r,boolean[]vis,int n){
        return r>=0 && r<n && !vis[r] ;
    }
}