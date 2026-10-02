class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> duplicate = new ArrayList<>();

        for(int i : arr){
            if(set.contains(i))
                duplicate.add(i);
            else
                set.add(i);
        }
        return duplicate;
    }
}