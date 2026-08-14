class Solution {
    public int minSubArrayLen(int target, int[] nums)
     {
        int total=Integer.MAX_VALUE;
        int start=0;
        int end=0;
        int sum=0;
        int n=nums.length;

        while(end<n){
            sum+=nums[end];

            while(sum>=target){
                total=Math.min(total,end-start+1);
                sum-=nums[start++];
            }
            end++;
        }

        return total==Integer.MAX_VALUE ? 0:total;
       

    }
}