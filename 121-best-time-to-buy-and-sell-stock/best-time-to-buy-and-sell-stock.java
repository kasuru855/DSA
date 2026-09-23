class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE,current=0;
        for(int i=0;i<prices.length;i++){
            min=Math.min(min,prices[i]);
            current=Math.max(current,(prices[i]-min));
        }
    
    return current;
}
}