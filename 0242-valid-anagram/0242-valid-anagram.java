class Solution {
    public boolean isAnagram(String s, String t) {
        String first = sort(s);
        String second = sort(t);
        
        return first.equals(second);
    }
    
    public String sort(String k){
        char[] charArray = k.toCharArray();
        Arrays.sort(charArray);
        return String.valueOf(charArray);
    }
}