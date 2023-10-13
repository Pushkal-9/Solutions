class Solution {
    public int findKthPositive(int[] arr, int k) {
        HashSet<Integer> set = new HashSet<>();

        for(int i: arr){
            set.add(i);
        }

        int c=1;
        while(k>0){
            if(!set.contains(c)){
                k--;
            }
            c++;
        }

        return c-1;
    }
}