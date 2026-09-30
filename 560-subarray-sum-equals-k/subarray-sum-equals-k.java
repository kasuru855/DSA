class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int cnt=0,currentSum=0;
        hm.put(0,1);
        for(int i=0;i<nums.length;i++){
            currentSum=currentSum+nums[i];
            if(hm.containsKey(currentSum-k)){
                cnt+=hm.get(currentSum-k);
               

            }
            hm.put(currentSum,hm.getOrDefault(currentSum,0)+1);

        }
        return cnt;
    }
}