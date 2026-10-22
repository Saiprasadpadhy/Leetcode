class Solution {
    public int maximumWealth(int[][] arr) {
        int max=0;
        int m = arr.length;
        int n = arr[0].length;

        for(int i=0;i<m;i++){
            int sum = 0;
            for(int j=0;j<n;j++){
                sum += arr[i][j];
            }
            if(max < sum){
                max = sum;
            }
        }
        return max;
    }
}