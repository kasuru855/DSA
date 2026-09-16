class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int l=0,h=arr.length-1,ans=Integer.MIN_VALUE;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid]<arr[mid+1]){
                l=mid+1;
            }else{
                ans=mid;
                h=mid-1;
            }
        }
        return ans;
    }
}