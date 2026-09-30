class Solution {
    public int pivotIndex(int[] nums) {
        int[] prev=new int[nums.length+1];
       
        prev[0]=0;
        for(int i=1;i<prev.length;i++){
            prev[i]=prev[i-1]+nums[i-1];
        }
        for(int i=0;i<nums.length;i++){
            int left=prev[i]-prev[0];
            int right=prev[nums.length]-prev[i+1];
            if (left==right){
                
                return i;
            }
        }
        return -1;
    }
}