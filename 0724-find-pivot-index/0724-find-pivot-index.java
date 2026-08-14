class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int leftSum=0;
        int rightSum=0;
        int left=0;
        int right=n-1;
        int sum=0;

        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        for(int i=0;i<n;i++){
           
            rightSum=sum-leftSum-nums[i];
            if(leftSum==rightSum){
                return i;
            }
             leftSum+=nums[i];
        }
        return -1;   
    }
}