class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> res=new HashSet<>();
        for(int num:nums1){
            set.add(num);
        }
        for(int numm:nums2){
            if(set.contains(numm)){
                res.add(numm);

            }
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}