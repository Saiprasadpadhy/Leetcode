class Solution {
    public int search(int[] arr, int target) {
        int l=0;
        int h=arr.length-1;
        int mid=0;
        while(l <= h){
            mid=(l+h)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                l = mid+1;
            }else
                h = mid-1;
        }
        return -1;
    }
}