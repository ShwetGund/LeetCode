class Solution {
    public int[] nextGreaterElements(int[] nums) {

        int n = nums.length;
        int[] answer = new int[n];

        Arrays.fill(answer, -1);

        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < 2 * n; i++) {

            int currentIndex = i % n;

            while (!stack.isEmpty() &&
                   nums[currentIndex] > nums[stack.peek()]) {

                int index = stack.pop();
                answer[index] = nums[currentIndex];
            }

            if (i < n) {
                stack.push(currentIndex);
            }
        }

        return answer;
    }
}