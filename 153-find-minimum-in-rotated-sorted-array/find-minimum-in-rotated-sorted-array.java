class Solution {
    public int findMin(int[] a) {
        int l=0,h=a.length-1,min=Integer.MAX_VALUE;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(a[l]<=a[mid]){
                min=Math.min(a[l],min);
                l=mid+1;


            }else{
                min=Math.min(min,a[mid]);
                h=mid-1;
            }
        }
        return min;
    }
}