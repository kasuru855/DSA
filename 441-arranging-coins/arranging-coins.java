class Solution {
    public int arrangeCoins(int n) {
        long l=1,h=n;
        while(l<=h){
            long mid=l+(h-l)/2;
            long sum=(mid*(mid+1))/2;
            if(sum==n){
                return (int)mid;
            }else if(sum<n){
                l=mid+1;
            }else{
                h=mid-1;
            }
        }
        return (int)h;
        
    }
    
    }
