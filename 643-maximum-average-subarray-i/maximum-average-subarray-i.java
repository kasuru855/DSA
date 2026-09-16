class Solution {
    public double findMaxAverage(int[] nums, int k) {
       int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int i=0,j=k;
        int max=sum;
        while(j<nums.length){
            sum+=nums[j];
            sum-=nums[i];
            max=Math.max(sum,max);
            j++;
            i++;

        }
        return (double)max/k;
    }
}