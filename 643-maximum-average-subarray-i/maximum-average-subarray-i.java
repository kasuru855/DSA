class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];

        }
        int l=0,r=k,max=sum;
        while(r<nums.length){
            sum=sum-nums[l];
            l++;
            sum=sum+nums[r];
            r++;
            max=Math.max(max,sum);
        }
    return (double)max/k;
        
    }
}