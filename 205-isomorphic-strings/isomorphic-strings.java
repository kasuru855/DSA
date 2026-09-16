class Solution {
    public boolean isIsomorphic(String s, String t) {
        int count[]=new int[256];
        int count2[]=new int[256];
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            if(count[s.charAt(i)]!=count2[t.charAt(i)]){
                return false;
            }
            count[s.charAt(i)]=i+1;
            count2[t.charAt(i)]=i+1;
           

        }
        return true;
    }
}