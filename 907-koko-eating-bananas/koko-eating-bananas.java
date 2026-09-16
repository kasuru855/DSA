class Solution {
    public int minEatingSpeed(int[] piles, int hh) {
        int max=Integer.MIN_VALUE;
        for(int num:piles){
            max=Math.max(num,max);
        }
        int l=1,h=max,ans=0;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(validate(piles,mid,hh)){
                ans=mid;
                h=mid-1;
                }else {
                    l=mid+1;
                }
        }
        return ans;
    }
    public static boolean validate(int[] piles,int mid,int hh){
        long count=0;
        int carry=0;
        for(int i=0;i<piles.length;i++){
            if(piles[i]<=mid){
                count+=1;

            }else{
            if((piles[i]%mid)==0){
                count+=piles[i]/mid;
            }else{
                count+=(piles[i]/mid)+1;
            }
                
            }

        }
        return (count<=hh);
    }
}