class Solution {
    public int search(int[] arr,int target) {
        int l=0,h=arr.length-1,mid=0;

        while(l<=h){
            mid=(l+h)/2;

            if(arr[mid]==target)
                return mid;
            if(arr[l]<=arr[mid]){
                if(arr[l]<=target && target<arr[mid])
                    h=mid-1;
                else
                    l=mid+1;
            }else{
                if(arr[mid]<target && target<=arr[h])
                    l=mid+1;
                else
                    h=mid-1;
            }
        }
        return -1;
    }
}