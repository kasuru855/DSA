class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        int a=0,b=0;
        for(int i=0;i<nums.length;i++){
            if(hs.containsKey(target-nums[i])){
                 a= hs.get(target-nums[i]);
                 b=i;
                break;
            }else{
                hs.put(nums[i],i);
            }
            
        }
        return new int[]{a,b};
    }
}