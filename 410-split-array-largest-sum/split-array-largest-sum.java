class Solution {
    public int splitArray(int[] nums, int k) {
        int sum=0,max=Integer.MIN_VALUE,ans=0;
        for(int num:nums){
            max=Math.max(num,max);
            sum+=num;

        }
        int l=max,h=sum;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(valid(nums,mid,k)){
                ans=mid;
                h=mid-1;
            }else{
                l=mid+1;
            }
        }
        return ans;
        
    }
    public static boolean valid(int[] nums,int mid,int k){
        int count=1,prev=mid;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=prev){
                prev=prev-nums[i];
            }else{
                count+=1;
                prev=mid-nums[i];
            }
        }
        return (count<=k);

    }
}