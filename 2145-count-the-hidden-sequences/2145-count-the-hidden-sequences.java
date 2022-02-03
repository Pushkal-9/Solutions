class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        int n=differences.length;
        int arr[]=new int[n+1];
        int count=0;
        // for(int i=lower;i<=upper;i++){
        //     arr[0]=i;
        //     boolean valid=true;
        //     for(int j=1;j<n+1;j++){
        //         arr[j]=differences[j-1]+arr[j-1];
        //         if(arr[j]<lower || arr[j]>upper){
        //             valid=false;
        //             break;
        //         }
        //     }
        //     if(valid){
        //         count++;
        //     }
        // }
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
            
            //System.out.print(arr[i]+" ");
        }
        System.out.print(min+" "+max);
        int k=lower-min;
        
        if(k>upper){
            return 0;
        }
        
        if(k+max>upper){
            return 0;
        }
        
        int p=upper-max;
        
        return p-k+1;
    }
}