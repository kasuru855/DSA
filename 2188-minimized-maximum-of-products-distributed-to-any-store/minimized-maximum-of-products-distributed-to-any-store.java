class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<quantities.length;i++){
            max=Math.max(max,quantities[i]);
        }
        int l=1,h=max,ans=-1;
        while(l<=h){
            int mid=(l+(h-l)/2);
            if(isValid(n,mid,quantities)){
                ans=mid;
                h=mid-1;
            }else{
                l=mid+1;
            }
        }
        return ans;
    }
    public static boolean isValid(int n,int mid,int[] quantities){
        int cnt=0;
        for(int i=0;i<quantities.length;i++){
            cnt+=(quantities[i]+mid-1)/mid;

        }
        return (cnt<=n);
    }
}