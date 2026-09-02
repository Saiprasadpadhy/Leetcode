class Solution {
    public int searchInsert(int[] arr, int t) {
        int l=0;
        int h=arr.length-1;
        //int mid=0;

        while(l<=h){
            int mid=(l+h)/2;
            if(arr[mid] == t){
                return mid;
            }else if(arr[mid]>t){
                h=mid-1;
            }else
                l=mid+1;
        }
        return l;
    }
}