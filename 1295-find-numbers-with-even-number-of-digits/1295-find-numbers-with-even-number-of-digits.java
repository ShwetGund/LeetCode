class Solution {
    public int findNumbers(int[] nums) {
        int evenCount = 0;

        for (int i = 0; i < nums.length; i++) {
            int number = nums[i];
            if (isEven(countDigit(number)))
                evenCount++;

        }
        return evenCount;

    }

    public int countDigit(int num) {
        int digit = 0;
        while (num != 0) {
            digit++;
            num /= 10;
        }
        return digit;
    }

    public boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;

        }
        return false;
    }

}