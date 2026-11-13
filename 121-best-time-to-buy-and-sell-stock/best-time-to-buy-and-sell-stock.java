class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int current=Integer.MIN_VALUE;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }else{
                current=Math.max(current,prices[i]-min);
            }
        }
        if(current==Integer.MIN_VALUE){
            return 0;
        }
        return current;
        
    }
}