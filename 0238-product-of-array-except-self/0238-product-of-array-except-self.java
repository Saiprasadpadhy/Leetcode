class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ret=new int[nums.length];
        int prod=1;
        int zer=0;
        for (int i:nums) {
            if(i==0){
                zer++;
                continue;
            }
            prod*=i;
        }
        if (zer==0) {
            for (int j=0;j<ret.length;j++) {
                ret[j]=prod/nums[j];
            }            
        }else if(zer==1){
            for (int j=0;j<ret.length;j++) {
                ret[j]=(nums[j]!=0)?0:prod;
            }
        }else{
            for (int j=0;j<ret.length;j++) {
                ret[j]=0;
            }
        }
        return ret;
    }
}