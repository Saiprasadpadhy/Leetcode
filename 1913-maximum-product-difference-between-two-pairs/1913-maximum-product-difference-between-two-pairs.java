class Solution {
    public int maxProductDifference(int[] arr) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for(int i : arr){
            if(i > max1){
                max2 = max1;
                max1 = i;
            }else if(i > max2){
                max2 = i;
            }
            if(i < min1){
                min2 = min1;
                min1 = i;
            }else if(i < min2){
                min2 = i;
            }
        }
        return (max2*max1) - (min2*min1);
    }
}