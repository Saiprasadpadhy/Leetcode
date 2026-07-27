class Solution {
    public int majorityElement(int[] arr) {
        int n = arr.length;
        
        for(int i=0;i<arr.length;i++){
            int c =0;
            for(int j =0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    c++;
                }
            }if(c>n/2){
                return arr[i];
            }
        }return -1;
    }
}