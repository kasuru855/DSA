class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int l=0,h=letters.length-1,found=-1,found2=-1;
        if(target>=letters[h]){
            return letters[l];
        }
        if(target<letters[l]){
            return letters[l];
        }
        while(l<=h){
            int mid=l+(h-l)/2;
            if(letters[mid]<=target){
                l=mid+1;
            
            }else{
                h=mid-1;
            }
        }
        return letters[l];
    }
}
            