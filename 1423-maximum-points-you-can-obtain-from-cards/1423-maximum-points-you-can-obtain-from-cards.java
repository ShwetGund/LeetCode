class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int maxScore = 0;
        int leftSum = 0;
        int rightSum = 0;
        int n = cardPoints.length - 1;

        for (int i = 0; i < k; i++) {
            leftSum += cardPoints[i];
        }
        maxScore = leftSum;

        for (int j = 0; j < k; j++) {
            leftSum -= cardPoints[k - 1 - j];
            rightSum += cardPoints[n - j];

            maxScore = Math.max(maxScore, leftSum + rightSum);
        }

        return maxScore;

    }
}