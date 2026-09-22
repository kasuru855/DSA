class Solution {
    public int characterReplacement(String s, int k) {
        int l=0,r=0,max=0;
        
        HashMap<Character,Integer> hs=new HashMap<>();
        int freq=0;
        while(r<s.length()){
            hs.put(s.charAt(r),hs.getOrDefault(s.charAt(r),0)+1);
            freq=Math.max(freq,hs.get(s.charAt(r)));
            
                while((r-l+1)-freq>k){
                    hs.put(s.charAt(l),hs.get(s.charAt(l))-1);
                    
                    l++;
                }
            
            
                max=Math.max(max,r-l+1);
                r++;
        }
            

        



        
        return max;
    }
}
