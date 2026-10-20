

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char i : s.toCharArray()) {

            if (isBracketOpen(i)) {
                stack.push(i);
            } else {

                if (stack.isEmpty()) {
                    return false;
                }

                if (isSameType(stack.peek(), i)) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private boolean isBracketOpen(char c) {
        return c == '(' || c == '[' || c == '{';
    }

    private boolean isSameType(char c, char d) {
        if (c == '(' && d == ')') {
            return true;
        } else if (c == '{' && d == '}') {
            return true;
        } else if (c == '[' && d == ']') {
            return true;
        } else {
            return false;
        }
    }
}

