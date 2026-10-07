class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];

        }
        int max=sum;
        int l=0,r=k;
        while(r<nums.length){
            sum-=nums[l];
            l++;
            sum+=nums[r];
            max=Math.max(sum,max);
            r++;
        }
        return (double)max/k;
    }
}