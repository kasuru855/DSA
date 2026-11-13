class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans=new int[nums.length];
        int[] left=new int[nums.length];
        int[] right=new int[nums.length];
        left[0]=1;
        right[nums.length-1]=1;
        int n=nums.length;
        for(int i=1;i<n;i++){
            left[i]=nums[i-1]*left[i-1];
            right[n-i-1]=nums[n-i]*right[n-i];

        }
        for(int i=0;i<n;i++){
            ans[i]=left[i]*right[i];

        }
        return ans;
        

        
    }
    
}