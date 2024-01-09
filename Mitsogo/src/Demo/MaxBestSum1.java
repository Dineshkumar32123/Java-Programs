package Demo;

public class MaxBestSum1 {

    public static int getMaxBestSum(int[] array, int n, int k) {
        if (k > n) {
            return -1; // Invalid input, K cannot be greater than N
        }

        int maxBestSum = Integer.MIN_VALUE;

        for (int i = 1; i <= k; i++) {
            int currentBestSum = findBestSum(array, n, i);
            maxBestSum = Math.max(maxBestSum, currentBestSum);
        }

        return maxBestSum;
    }

    private static int findBestSum(int[] array, int n, int k) {
        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            int currentSegmentSum = 0;
            dp[i] = Integer.MAX_VALUE;

            for (int j = i; j > 0 && i - j + 1 <= k; j--) {
                currentSegmentSum += array[j - 1];
                dp[i] = Math.min(dp[i], Math.max(dp[j - 1], currentSegmentSum));
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        // Example usage:
        int[] input = {1, 2, 3, 4};
        int length = 4;
        int k = 2;
        int result = getMaxBestSum(input, length, k);
        System.out.println("Output: " + result);
    }


}
