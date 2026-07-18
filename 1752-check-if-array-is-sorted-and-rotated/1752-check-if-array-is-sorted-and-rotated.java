class Solution {
    public boolean check(int[] arr) {
        int c =0;
        int n = arr.length;
        for(int i =0;i<arr.length;i++){
            if(arr[i] > arr[(i+1) % n ]){
                c++;
            }
        }return c <= 1;
    }
}