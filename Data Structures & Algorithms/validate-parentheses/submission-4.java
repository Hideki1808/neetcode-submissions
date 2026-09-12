class Solution {
    public boolean isValid(String s) {
        int length = s.length();

        // A valid string must contain pairs of brackets
        if (length % 2 != 0) {
            return false;
        }

        char[] stack = new char[length / 2];
        int top = 0;

        for (int i = 0; i < length; i++) {
            char current = s.charAt(i);

            if (current == '(' || current == '[' || current == '{') {
                // More opening brackets than could possibly be matched
                if (top == stack.length) {
                    return false;
                }

                stack[top] = current;
                top++;
            } else {
                // No opening bracket is available
                if (top == 0) {
                    return false;
                }

                char opening = stack[top - 1];

                if (current == ')' && opening != '(' ||
                    current == ']' && opening != '[' ||
                    current == '}' && opening != '{') {
                    return false;
                }

                top--;
            }
        }

        return top == 0;
    }
}