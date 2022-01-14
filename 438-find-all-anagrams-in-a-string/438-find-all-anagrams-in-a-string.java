class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n=p.length();
        int m=s.length();
        
        ArrayList<Integer> res=new ArrayList<>();
        HashMap<Character,Integer> map=new HashMap<>();
        
        for(int i=0;i<n;i++){
            if(!map.containsKey(p.charAt(i))){
                map.put(p.charAt(i),1);
            }
            else{
                map.put(p.charAt(i),map.get(p.charAt(i))+1);
            }
        }
        
        for(int i=0;i<m-n+1;i++){
            if(isAnagram(s.substring(i,i+n),p)){
                res.add(i);
                while(i+n<m && s.charAt(i)==s.charAt(i+n)){
                    res.add(++i);
                }
            }
        }
        
        return res;
    }
    
//     public boolean isAnagram(String a,HashMap<Character,Integer> mapping){
// //         char[]s1=a.toCharArray();
// //         Arrays.sort(s1);
// //         String k=new String(s1);
// //         if(k.equals(t)){
// //             return true;
// //         }
        
// //         return false;
        
        
//         HashMap<Character,Integer> map=new HashMap<>();
        
//         for(int i=0;i<a.length();i++){
//             if(!map.containsKey(a.charAt(i))){
//                 map.put(a.charAt(i),1);
//             }
//             else{
//                 map.put(a.charAt(i),map.get(a.charAt(i))+1);
//             }
//         }
        
//         for(Character key :map.keySet()){
//             if(map.get(key)!=mapping.get(key)){
//                 return false;
//             }
//         }
        
//         return true;
//     }
    
    private boolean isAnagram(String s, String p) {
        int[] count = new int[26];
        char[] c1 = s.toCharArray();
        char[] c2 = p.toCharArray();
        
        for(int i = 0; i < c1.length;i++) {
            count[c1[i] - 'a']++;
            count[c2[i] - 'a']--;
        }
        //System.out.println(Arrays.toString(count));
        for(int i = 0;i < count.length;i++) {
            if(count[i] != 0) {
                return false;
            }
        }
        return true;
    }
}