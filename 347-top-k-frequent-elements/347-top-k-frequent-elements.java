class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums==null)
            return null;
        
        Map<Integer,Integer> map = new HashMap<>();
        for(int p: nums)
            map.put(p,map.getOrDefault(p,0)+1);
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b)->a.getValue()-b.getValue());
        for(Map.Entry<Integer,Integer> entry: map.entrySet()) {
            pq.offer(entry);
            if(pq.size()>k)
                pq.poll();
        }
        int[] res= new int[pq.size()];
        int i=0;
        while(!pq.isEmpty()) {
            res[i]=pq.poll().getKey();
            i++;
        }
        return res;
        
    }
}