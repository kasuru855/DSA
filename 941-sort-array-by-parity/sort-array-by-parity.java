class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        int even=0,odd=n-1;
        int[] finaal=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                finaal[even++]=nums[i];

            }else{
                finaal[odd--]=nums[i];
            }

        }
        return finaal;
    }
}