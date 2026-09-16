class Solution {
    public int maxDistance(int[] position, int m) {
        
       Arrays.sort(position);
       int max=position[position.length-1];
       int min=position[0];
       int ans=0;
        int l=0,h=max-min;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(valid(position,m,mid)){
                ans=mid;
                l=mid+1;
            }else{
                h=mid-1;
            }
        }
        return ans;
    }
    public static boolean valid(int[] position,int m,int mid){
        int cnt=1,prev=position[0],start=0;
        for(int i=start;i<position.length;i++){
           if((position[i]-prev)>=mid){
            prev=position[i];
            start=i;
            cnt+=1;
           }
           
        }

        return (cnt>=m);
    }
}