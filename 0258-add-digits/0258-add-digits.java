class Solution {
    public int addDigits(int x) {
        if(x == 0){
            return 0;
        }else if(x % 9 == 0) {
            return 9;}
        else 
            return x % 9;
        
    }
}