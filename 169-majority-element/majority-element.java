class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int res=1;
        int count=1;
        if(nums.length==1){
            return nums[0];
        }
        for(int i=0;i<nums.length-1;i++){
        
            if(nums[i]==nums[i+1]){
                count++;
            }else{
                count=1;
                
            }
        if((count)>(nums.length/2))
        res=nums[i];

        
        }
        return res;
    }
}