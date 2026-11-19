class Solution {
    public boolean isValid(String s) {
        Stack<Character> s1 = new Stack<>();

        for(char i : s.toCharArray()){
            if( i== '(' || i== '[' || i=='{'){
                s1.push(i);
            }else{
                
                if(s1.isEmpty()){
                    return false;
                }
                char top = s1.pop();
                if(i == ')' && top != '('){
                    return false;
                }if(i == ']' && top != '['){
                    return false;
                }if(i == '}' && top != '{'){
                    return false;
                }
            }
        }
        return s1.isEmpty();
    }
}
