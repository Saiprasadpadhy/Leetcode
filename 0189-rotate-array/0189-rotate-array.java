// class Solution {
//     public void rotate(int[] nums, int k) {
//         int arr[] = new int[nums.length];
//         int x = 0;
//         int n = nums.length;
//         k = k % n;
//         for(int i=n-k; i< n;i++){
//             arr[x] = nums[i];
//             x++;
//         }for(int j=0;j< n-k;j++){
//             arr[x]=nums[j];
//             x++;
//         }for(int b=0;b<n ;b++){
//             nums[b]=arr[b];
//         }
//     }
// }


// ALTERNATE METHOD..................

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n; // Normalize k
        
        // Step 1: Reverse the whole array
        reverse(nums, 0, n - 1);
        // Step 2: Reverse the first k elements
        reverse(nums, 0, k - 1);
        // Step 3: Reverse the remaining elements
        reverse(nums, k, n - 1);
    }
    
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
