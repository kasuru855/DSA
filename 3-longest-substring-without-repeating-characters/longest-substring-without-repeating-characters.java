class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs=new HashSet<>();
        int l=0,r=0;
        int max=0;
        while(r<s.length()){
            if(!hs.contains(s.charAt(r))){
                max=Math.max(max,r-l+1);
                hs.add(s.charAt(r));
                r++;
            }else{
                hs.remove(s.charAt(l));
                l++;
            }
        }
        return max;
    }
}