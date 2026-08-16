class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max_Con=0;
        int Con=0;
        

        for(int end:nums){
            if(end==1){
                Con++;     
            }else{
                Con=0;    
            }
            max_Con=Math.max(max_Con,Con);
        }return max_Con;
}

}