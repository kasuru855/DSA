class Solution {
    public int maxSubArray(int[] nums) {
       int prev=0,max=Integer.MIN_VALUE,current=0;
       for(int i=0;i<nums.length;i++){
        current=nums[i]+prev;
        max=Math.max(current,max);
        prev=current<0?0:current;

       } 
        return max;
    }
}