//package Demo;
//
//import java.util.Arrays;
//
//public class MaxBestSum {
//
//    public static void main(String[] args) {
//        int[] input1 = {1, 2, 3, 4};
//        int input2 = 4;
//        int input3 = 2;
//
//        int result = maxBestSum(input1[], input2, input3);
//        System.out.println("Output: " + result);
//    }
//
//    static int maxBestSum(int[] array, int inp, int K) {
//        int maxBestSum = Integer.MIN_VALUE;
//
//        for (int i = 1; i <= N; i++) {
//            int[] dp = new int[N + 1];
//            Arrays.fill(dp, Integer.MAX_VALUE);
//            dp[0] = 0;
//
//            for (int j = 1; j <= K; j++) {
//                int sum = 0;
//                for (int k = i; k <= N; k++) {
//                    sum += array[k - 1];
//                    dp[k] = Math.min(dp[k], Math.max(dp[k - i], sum));
//                }
//            }
//
//            maxBestSum = Math.max(maxBestSum, dp[N]);
//        }
//
//        return maxBestSum;
//    }
//}
