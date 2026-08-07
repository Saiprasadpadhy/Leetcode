class Solution {
    public String reverseWords(String s) {
        String[] arr = s.trim().split("\\s+");
        int i=0,j=arr.length-1;
        while(i<j) {
            String x = arr[i];
            arr[i] = arr[j];
            arr[j] = x;
            i++;
            j--;
        }
        return String.join(" ", arr);
    }
}