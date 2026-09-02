class Solution {

    public int[] searchRange(int[] nums, int target) {

        int first = lowerBound(nums, target);
        int last = upperBound(nums, target) - 1;
        if (first == nums.length || nums[first] != target) {
            return new int[]{-1, -1};
        }
        return new int[]{first, last};
    }
    public int lowerBound(int[] nums, int target) {

        int l = 0;
        int h = nums.length - 1;
        int ans = nums.length;

        while (l <= h) {
            int mid = l + (h - l) / 2;

            if (nums[mid] >= target) {
                ans = mid;
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }
    public int upperBound(int[] nums, int target) {

        int l = 0;
        int h = nums.length - 1;
        int ans = nums.length;

        while (l <= h) {

            int mid = l + (h - l) / 2;

            if (nums[mid] > target) {
                ans = mid;
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }
}