class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int res=0,cur=0;
        for(int i=0;i<values.length-1;i++){
            cur=Math.max(cur,values[i]+i);
            res=Math.max(res,cur+values[i+1]-i-1);
        }
        
        return res;
    }
}