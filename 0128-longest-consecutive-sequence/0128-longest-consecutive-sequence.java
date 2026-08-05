class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int cur = 0;
        int max = 0;
        int i = 0;

        if (nums.length <= 0) {
            return 0;
        }
        while (i < nums.length - 1) {
            int x = nums[i] - nums[i+1];
            if (x == -1) {
                cur++;
                i++;
            } else if (x == 0) {
                i++;
            } else {
                max = Math.max(max, cur);
                cur = 0;
                i++;
            }
        }
        max = Math.max(max, cur);
        return max + 1;
    }
}