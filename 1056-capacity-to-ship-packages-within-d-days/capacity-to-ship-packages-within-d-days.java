class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int sum=0,max=Integer.MIN_VALUE,ans=0;
        for(int num:weights){
             max=Math.max(num,max);
            sum+=num;
        }
        int l=max,h=sum,mid=0;
        while(l<=h){
         mid=l+(h-l)/2;
            if(valid(weights,mid,days)){
                ans=mid;
                h=mid-1;
            }else{
                l=mid+1;
            }
        }
        return ans;
    }
    public static boolean valid(int[] weights,int mid,int days){
        int count=1,prev=mid;
        for(int i=0;i<weights.length;i++){
            if(weights[i]<=prev){
                prev=prev-weights[i];

            }else{
                count+=1;
                prev=mid-weights[i];
                
            }
        }
        return (count<=days);

    }
}