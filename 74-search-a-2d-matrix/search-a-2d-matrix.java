class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l=0,m=matrix.length,n=matrix[0].length,h=m*n-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            int row=mid/n;
            int col=mid%n;
            if(matrix[row][col]==target){
                return true;
            }else if(matrix[row][col]<target){
                l=mid+1;
            }else{
                h=mid-1;
            }
        }
        return false;
    }
}