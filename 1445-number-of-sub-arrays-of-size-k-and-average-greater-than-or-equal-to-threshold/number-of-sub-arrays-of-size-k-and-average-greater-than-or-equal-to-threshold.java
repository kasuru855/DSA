class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int cnt=0,sum=0,l=0,r=k;
        for(int i=0;i<k;i++){
            sum=sum+arr[i];
        }
        if(sum/k>=threshold){
            cnt=cnt+1;

        }
        while(r<arr.length){
            sum=sum-arr[l];
            l++;
            sum=sum+arr[r];
            r++;
            int avg=sum/k;
            if(avg>=threshold){
                cnt=cnt+1;

            }
        }
        return cnt;
    }
}