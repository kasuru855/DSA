class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum=0,max=0,rightInd=cardPoints.length-1;
        for(int i=0;i<k;i++){
            sum=sum+cardPoints[i];

        }
        max=sum;
        for(int i=k-1;i>=0;i--){
            sum=sum-cardPoints[i];
            sum=sum+cardPoints[rightInd];
            rightInd--;
            max=Math.max(max,sum);
        }
        return max;
    }
}