class Solution {
    public int lengthOfLastWord(String s) {
        int count=0,i=s.length()-1;
        while(i>=0){
            
            if(s.charAt(i)!=' '){
                count++;
                i--;
                continue;
                

            }else{
                if(count>0){
                    return count;
                }else{
                    i--;
                }
            }
            
        }
        return count;
    }
}