class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0;
        
        HashSet<Character>  set = new HashSet<>();
        int max=0;
        
        while(end<s.length()){
            if(set.contains(s.charAt(end))){
                set.remove(s.charAt(start));
                start++;
            }
            else{
                set.add(s.charAt(end));
                max=Math.max(max,set.size());
                end++;
            }
            //System.out.println(start+" " + end + " "+ max);
        }
        
        return max;
    }
}