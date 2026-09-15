class Solution {
    public int mySqrt(int x) {
        int l=1,h=x;
        while(l<=h){
            int mid=l+(h-l)/2;
            long squ=(long)mid*mid;

            if(squ==x){
                return mid;
            }else if(squ<x){
                l=mid+1;
        }else{
            h=mid-1;
        }
        }

        return h;

    }
}