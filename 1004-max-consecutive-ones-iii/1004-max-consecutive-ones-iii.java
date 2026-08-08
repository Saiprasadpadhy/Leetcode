class Solution {
    public int longestOnes(int[] arr, int k) {
        int n = arr.length;
        int l=0,r=0,z=0,max=0;
        for(r=0; r<n;r++){
            if(arr[r] == 0){
                z++;
            }
            while(z>k){
                if(arr[l]==0){
                    z--;
                }
                l++;
            }max = Math.max(max,r-l+1);
        }
        return max;
    }
}