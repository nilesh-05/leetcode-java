class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int j=0;j<nums.length;j++){
            currentSum += nums[j];
            maxSum = Math.max(maxSum,currentSum);
            currentSum = Math.max(currentSum,0);
        }
        return maxSum;
    }
}