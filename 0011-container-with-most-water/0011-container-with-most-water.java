class Solution {
    public int maxArea(int[] arr) {
        int left=0;
        int right = arr.length - 1;
        int cur_area=0;
        int max_area =0;

        while(left < right){
            cur_area = Math.min(arr[left],arr[right])*(right - left);

            max_area = Math.max(cur_area ,max_area);

            if(arr[left] > arr[right]) right--;
            else left++;

        }
        return max_area;
    }
}