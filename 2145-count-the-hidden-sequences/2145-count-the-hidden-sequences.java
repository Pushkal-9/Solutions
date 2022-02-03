class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        int n=differences.length;
        int min=0;
        int max=0;
        int now=0;
        int prev=0;
        for(int i=1;i<n+1;i++){
            now=prev+differences[i-1];
            
            if(min>now){
                min=now;
            }
            
            if(max<now){
                max=now;
            }
            
            prev=now;
        }
        int k=lower-min;
        
        if(k>upper || k+max>upper){
            return 0;
        }
        
        int p=upper-max;
        return p-k+1;
    }
    
    
    
}