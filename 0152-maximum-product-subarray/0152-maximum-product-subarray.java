class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int maxPro=Integer.MIN_VALUE;
        int leftPro=1;
        int rightPro=1;
        
        
        for(int i=0;i<n;i++){

            leftPro=leftPro*nums[i];
            rightPro=rightPro*nums[n-1-i];
            maxPro=max(leftPro,rightPro,maxPro);

            if(leftPro==0){
                leftPro=1;
            }
            if(rightPro==0){
                rightPro=1;
            }
    

        }
        return maxPro;

    }
    public static int max(int a,int b,int c){
      int max=Math.max(a,Math.max(b,c));
      return max;
    }
}