class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        boolean x = (s+s).contains(goal);
        return x;
    }
}