class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(t.length() != s.length()){
            return false;
        }

        int[] arr = new int[26];

        for(int i=0;i<t.length();i++){
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }
        for(int ch : arr){
            if(ch != 0){
                return false;
            }
        }
        return true;
    }   
}