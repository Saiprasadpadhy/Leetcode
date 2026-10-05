class Solution {
    public void merge(int[] arr1, int m, int[] arr2, int n) {
        int t1 = m-1 , t2 =n-1 , t3 = m+n-1;

        while(t1>=0 && t2>=0){
            if(arr2[t2]>arr1[t1]){
                arr1[t3] = arr2[t2];
                t3--;
                t2--; 
            }else{
                arr1[t3] = arr1[t1];
                t3--;
                t1--;
            }
        }
        while(t2 >= 0){
            arr1[t3] = arr2[t2];
            t3--;
            t2--;
        }
    }
}