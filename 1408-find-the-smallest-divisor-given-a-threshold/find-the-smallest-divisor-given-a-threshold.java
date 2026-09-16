class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max=Integer.MIN_VALUE;
        for(int num:nums){
            max=Math.max(max,num);
           
        }
        
        int l=1,h=max;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(valid(nums,threshold,mid)){
                
                h=mid-1;
            }else{
                l=mid+1;
            }
        }
        return l;
    }
    public static boolean valid(int[] nums,int threshold,int mid){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=(nums[i]+mid-1)/mid;

        }
        return (sum<=threshold);
    }
}