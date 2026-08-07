class Solution {
    public boolean isPalindrome(int x) {
        int num=x;
        if(num<0){
            return false;
        }
        int rev=0;

        while(num!=0){
            int rem = num %10;
            rev=(rev*10)+rem;
            num/=10;

        }
        if(x==rev){
            return true;

        }
        return false;
        
    }
}