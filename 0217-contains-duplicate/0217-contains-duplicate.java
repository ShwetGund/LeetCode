class Solution {
    public boolean containsDuplicate(int[] nums) {
        int j = 1;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[j]) {
                return true;
            }
            j++;

        }
        return false;

    }
}