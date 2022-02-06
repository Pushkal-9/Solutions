class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int n=bloomDay.length;
        if (m * k > n) return -1;
        for(int i:bloomDay){
            if(i>max){
                max=i;
            }
            if(i<min){
                min=i;
            }
        }
        int res=max;
        while(min<=max){
            int mid= (max-min)/2 +min;
            int flow=0,b=0;
            for(int i=0;i<bloomDay.length;i++){
                if(bloomDay[i]>mid){
                    flow=0;
                }
                else{
                flow++;}
                
                if(flow>=k){
                    b++;
                    flow=0;
                }
            }
            
            if(b>=m){
                res=Math.min(res,mid);
                max=mid-1;
            }
            else{
                min=mid+1;
            }
        }
        
        return res;
    }
}