class Solution {
    public String largestOddNumber(String num) {
        int n = (int)num.charAt(num.length()-1);

        if(n%2 == 1){
            return num;
        }
        int x=num.length()-1;
        while(x>=0){
            int y = num.charAt(x);
            if(y%2 == 1){
                return num.substring(0,x+1);
            }x--;
        }return "";
    }
}