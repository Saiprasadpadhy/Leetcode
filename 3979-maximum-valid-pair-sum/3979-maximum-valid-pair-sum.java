class Solution {
    public int maxValidPairSum(int[] arr, int k) {
        int x=0;
        int y=0;
        int n = arr.length;
        for(int i=0 ; i<n-k; i++){
            x = Math.max(x,arr[i]);
            y = Math.max(y,x+arr[i+k]);
        }
        return y;
    }
}