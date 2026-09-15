class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null||strs.length==0){
            return "";
        }
        String fix=strs[0];
        for(int i=1;i<strs.length;i++){

            String s=strs[i];
            while(s.indexOf(fix)!=0&&fix.length()>0){
                fix=fix.substring(0,fix.length()-1);
                if(fix.length()==0){
                    return "";
                }

            }


        }
        return fix;
    }
}