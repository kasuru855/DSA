class NumArray {
    int[] prev;

    public NumArray(int[] nums) {
        prev=new int[nums.length+1];
        prev[0]=0;
        for(int i=1;i<prev.length;i++){
            prev[i]=prev[i-1]+nums[i-1];
        }

        
    }
    
    public int sumRange(int left, int right) {
        int ans=prev[right+1]-prev[left];
        return ans;
        
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */