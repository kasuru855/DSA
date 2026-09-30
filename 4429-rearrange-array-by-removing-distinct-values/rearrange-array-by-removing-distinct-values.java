class Solution {
    public int[] rearrangeArray(int[] nums) {
       TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            
        }
        int[] ans=new int[nums.length];
        int ind=0;
        while(!map.isEmpty()){
        Integer[] uniq=map.keySet().toArray(new Integer[0]);
        for(int key:uniq){
            ans[ind++]=key;
            if(map.get(key)==1){
                map.remove(key);
            }else{
                map.put(key,map.get(key)-1);
            }
        }
        }
        return ans;
        }
    }
