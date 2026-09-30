class Solution {
    public int maxVowels(String s, int k) {
        HashSet<Character> hs=new HashSet<>();
        hs.add('a');
        hs.add('e');
        hs.add('i');
        hs.add('o');
        hs.add('u');
        
        int currentmax=0;
        for(int i=0;i<k;i++){
            if(hs.contains(s.charAt(i))){
                currentmax++;
            }
        }
        int max=currentmax;
        int l=0,r=k;
        while(r<s.length()){
            if(hs.contains(s.charAt(l))){
                currentmax--;
            }
            l++;
            if(hs.contains(s.charAt(r))){
                currentmax++;

            }
            max=Math.max(max,currentmax);
            r++;
        }
        return max;
    }
}