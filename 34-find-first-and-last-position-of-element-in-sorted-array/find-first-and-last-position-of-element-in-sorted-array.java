class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l=0,h=nums.length-1,p1=-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(nums[mid]==target){
                p1=mid;
                h=mid-1;
            }else if(nums[mid]<target){
                l=mid+1;

            }else{
                h=mid-1;
            }
        }
        l=0;
        h=nums.length-1;
        int p2=-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(nums[mid]==target){
                p2=mid;
                l=mid+1;
            }else if(nums[mid]<target){
                l=mid+1;
            }else{
                h=mid-1;
            }
        }
        return new int[]{p1,p2};
    }
}