class Solution {
    public int maxProfit(int[] x) {
        int minprice = x[0];
        int maxprof = 0;

        for(int i=1;i<x.length;i++){
            maxprof = Math.max(maxprof,x[i]-minprice);
            minprice = Math.min(x[i],minprice);
        }
        return maxprof;
    }
}
