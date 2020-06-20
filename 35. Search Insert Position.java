class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int ans = nums.length; // Default answer if doesn't found
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= target) {
                ans = mid; 
                right = mid - 1; 
            } else {
                left = mid + 1; 
            }
        }
        return ans;
    }
}