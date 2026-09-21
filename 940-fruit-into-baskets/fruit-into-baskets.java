class Solution {
    public int totalFruit(int[] fruits) {
        int l=0,max=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int r=0;r<fruits.length;r++){
            hm.put(fruits[r],hm.getOrDefault(fruits[r],0)+1);
            while(hm.size()>2){
                hm.put(fruits[l],hm.get(fruits[l])-1);
                if(hm.get(fruits[l])==0){
                    hm.remove(fruits[l]);
                }
                l++;
            
            }
            
        max=Math.max(max,r-l+1);
            
            
        }
        return max;
    }
}