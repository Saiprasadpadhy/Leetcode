class Solution {
    public int[] rearrangeArray(int[] a1) {
        int[] a2 = new int[a1.length];

        int p=0;
        int n=1;

        for(int i =0;i<a1.length;i++){
            if(a1[i]>0){
                a2[p]=a1[i];
                p+=2;
            }else if(a1[i]<0){
                a2[n]=a1[i];
                n+=2;
            }
        }
        return a2;
    }
}


