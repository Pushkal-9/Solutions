class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        int n=differences.length;
        int arr[]=new int[n+1];
        int min=0;
        int max=0;
        for(int i=1;i<n+1;i++){
            arr[i]=arr[i-1]+differences[i-1];
            
            if(min>arr[i]){
                min=arr[i];
            }
            
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.print(min+" "+max);
        int k=lower-min;
        
        if(k>upper || k+max>upper){
            return 0;
        }
        
        int p=upper-max;
        return p-k+1;
    }
}