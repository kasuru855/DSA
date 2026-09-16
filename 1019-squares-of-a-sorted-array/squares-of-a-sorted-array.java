class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0,j=nums.length-1,k=nums.length-1;
        int[] temp=new int[nums.length];
        while(i<=j){
            if(nums[i]*nums[i]>nums[j]*nums[j]){
                temp[k]=nums[i]*nums[i];
                k--;
                i++;
            }else{
                temp[k]=nums[j]*nums[j];
                k--;
                j--;
            }
        }
        return temp;
        
    }
}