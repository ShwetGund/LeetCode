class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length-1;

        int squ[]=new int[n+1];
        
        for(int i=0;i<=n;i++){

            squ[i]=nums[i]*nums[i];
        }
        Arrays.sort(squ);
        return squ;
        
    }
}