class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int currentSum=0,max=0;
        hm.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                nums[i]=-1;
            }
            currentSum+=nums[i];
            if(hm.containsKey(currentSum)){
                max=Math.max(max,i-hm.get(currentSum));
            }
           else{
                 hm.put(currentSum,i);
        }
        
    }
    return max;
    }

}