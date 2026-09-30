class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int[] p=new int[nums.length];
        HashMap<Integer,Integer> hm=new HashMap<>();
        int current=0;
        hm.put(0,-1);

        for(int i=0;i<nums.length;i++){
            current+=nums[i];
        
        if(hm.containsKey(current%k)){
            int diff=i-hm.get(current%k);
            if(diff>=2){
                return true;
            }

        }
        else{
            hm.put(current%k,i);
        }
        }
        return false;
    }
}