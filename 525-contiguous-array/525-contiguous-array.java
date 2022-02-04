class Solution {
    public int findMaxLength(int[] arr) {
        int n=arr.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        int max=0;
        map.put(0,-1);
        int prev=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                arr[i]=-1;
            }
            arr[i]=arr[i]+prev;
            prev=arr[i];
            if(map.containsKey(arr[i])){
               max=Math.max(max,i-map.get(arr[i])); 
            }
            else{
                map.put(arr[i],i);
            }
        }
        
        return max;
    }
}