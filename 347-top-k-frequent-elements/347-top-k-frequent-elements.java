class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Pair> heap=new PriorityQueue<>(k,new PairComparater());
        
        HashMap<Integer,Pair> map=new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                Pair p=new Pair(nums[i],1);
                heap.add(p);
                map.put(nums[i],p);
                //heap.poll();
            }
            else{
                Pair p=new Pair(nums[i],map.get(nums[i]).freq+1);
                heap.remove(map.get(nums[i]));
                heap.add(p);
                map.put(nums[i],p);
            }
        }
        System.out.println(heap.size());
        
        int[] res=new int[k];
        //int i=0;
        // for(Pair element :heap){
        //     res[i]=element.num;
        //     i++;
        //     if(i>=k){
        //         break;
        //     }
        // }
        
        for(int i=0;i<k;i++){
            res[i]=heap.poll().num;
        }
        
        return res;
    }
    
    class Pair{
        int num;
        int freq;
        public Pair(int num,int freq){
            this.num=num;
            this.freq=freq;
        }
    }
    
    class PairComparater implements Comparator<Pair>{
        public int compare(Pair a,Pair b){
             if(a.freq>b.freq){
                 return -1;
             }
            if(a.freq<b.freq){
                return 1;
            }
            
            return 0;
        }
    }
}