class Solution {
    public int[] intersection(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();

        for(int i : arr1){
            set.add(i);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int j : arr2){
            if(set.contains(j)){
                list.add(j);
                set.remove(j);
            }
        }
        int[] res = new int[list.size()];
        for(int i=0; i < list.size(); i++){
            res[i] = list.get(i);
        }

        return res;
    }
}