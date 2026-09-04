class Solution {
    public int firstStableIndex(int[] nums, int k) {

        int n = nums.length;

        for (int i = 0; i < n; i++) {

            // Find maximum from index 0 to i
            int maxLeft = nums[0];

            for (int j = 0; j <= i; j++) {
                maxLeft = Math.max(maxLeft, nums[j]);
            }

            // Find minimum from index i to n-1
            int minRight = nums[i];

            for (int j = i; j < n; j++) {
                minRight = Math.min(minRight, nums[j]);
            }

            // Calculate instability
            int instability = maxLeft - minRight;

            // Check if index is stable
            if (instability <= k) {
                return i;
            }
        }

        // No stable index found
        return -1;
    }
}
