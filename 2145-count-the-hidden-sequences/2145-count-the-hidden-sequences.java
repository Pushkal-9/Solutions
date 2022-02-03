class Solution {
//     public int numberOfArrays(int[] differences, int lower, int upper) {
//         int n=differences.length;
//         int min=0;
//         int max=0;
//         int now=0;
//         int prev=0;
//         for(int i=1;i<n+1;i++){
//             now=prev+differences[i-1];
            
//             if(min>now){
//                 min=now;
//             }
            
//             if(max<now){
//                 max=now;
//             }
            
//             prev=now;
//         }
//         System.out.print(min+" "+max);
//         int k=lower-min;
        
//         if(k>upper || k+max>upper){
//             return 0;
//         }
        
//         int p=upper-max;
//         return p-k+1;
//     }
    
    
    public int numberOfArrays(int[] diff, int lower, int upper) {
        long a = 0, ma = 0, mi = 0;
        for (int d: diff) {
            a += d;
            ma = Math.max(ma, a);
            mi = Math.min(mi, a);
        }
        return (int)Math.max(0, (upper - lower) - (ma - mi) + 1);
    }
}