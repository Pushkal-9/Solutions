class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n=p.length();
        int m=s.length();
        
        ArrayList<Integer> res=new ArrayList<>();
        
        char[]s1=p.toCharArray();
        Arrays.sort(s1);
        String k=new String(s1);
        
        for(int i=0;i<m-n+1;i++){
            if(isAnagram(s.substring(i,i+n),k)){
                res.add(i);
                while(i+n<m && s.charAt(i)==s.charAt(i+n)){
                    res.add(++i);
                }
            }
        }
        
        return res;
    }
    
    public boolean isAnagram(String a,String t){
        char[]s1=a.toCharArray();
        Arrays.sort(s1);
        String k=new String(s1);
        if(k.equals(t)){
            return true;
        }
        
        return false;
    }
}