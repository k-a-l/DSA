class Solution {
    public int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            // Step 1: Direct hit
            if (nums[mid] == target) {
                return mid;
            }

            // Step 2: Check which half is sorted
            if (nums[mid] < nums[right]) {
                // Right half is sorted

                if (nums[mid] <= target && target <= nums[right]) {
                    left = mid + 1;     // target in right half
                } else {
                    right = mid - 1;    // target in left half
                }

            } else {
                // Left half is sorted

                if (nums[left] <= target && target <= nums[mid]) {
                    right = mid - 1;    // target in left half
                } else {
                    left = mid + 1;     // target in right half
                }
            }
        }

        return -1;
    }
}
