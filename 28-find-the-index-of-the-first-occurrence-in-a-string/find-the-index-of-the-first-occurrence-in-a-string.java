class Solution {
    public int strStr(String haystack, String needle) {
       int h=haystack.length();
       int n=needle.length();
       for(int i=0;i<=h-n;i++){
        String current=haystack.substring(i,i+n);
        if(current.equals(needle)){
            return i;
        }
       }
       return -1;
        }
        
    }
