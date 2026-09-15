class Solution {
    public int[] twoSum(int[] numbers, int k) {
        int p1=0,p2=numbers.length-1,ind1=0,ind2=0;
        while(p1<p2){
            if(numbers[p1]+numbers[p2]==k){
                ind1=p1;
                ind2=p2;
                break;
            }else if(numbers[p1]+numbers[p2]<k){
                p1++;
            }else{
                p2--;
            }

            }
            return new int[]{ind1+1,ind2+1};
        }
    }
