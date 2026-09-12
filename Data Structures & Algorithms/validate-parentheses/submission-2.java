class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for(int i = 0; i<s.length(); i++){
            char curr = s.charAt(i);

            if (curr == '('||curr == '['||curr == '{'){
                st.add(curr);
            }

            else {
                if(st.empty()){
                    return false;
                }

                if (curr == ')'&& st.peek() != '('){ //if the char is ')' and the top of the    stack is anything different than '(' (its pair) return false
                    return false;
                }  
                
                if (curr == ']'&& st.peek() != '['){
                    return false;
                }

                if (curr == '}'&& st.peek() != '{'){
                    return false;
                }

                st.pop(); //if none of the (blocking) considitons happen the top item will be popped off the list (which means the algorithm found a match)
                
            }

            
        }
        return st.empty();
    }
}
