class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tCost=0;
        int tGas=0;
        int n=gas.length;
        int index=-1;
        for(int i=0;i<n;i++){
            index=i;
            tCost=0;
             tGas=0;
            int j=i;
            for(j=i;j<i+n;j++){
                tCost=cost[j%n]+tCost;
                tGas=tGas+gas[j%n];
                if(tGas<tCost){
                    if(j<n){
                    i=j%n;}
                    index=-1;
                    break;
                }
            }
            
            if(index!=-1){
                return index;
            }
        }
        
        return index;
    }
}