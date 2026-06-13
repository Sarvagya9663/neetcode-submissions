class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> closeopen = new HashMap<>();
        closeopen.put(')', '(');
        closeopen.put(']', '[');
        closeopen.put('}', '{');
        for(char c : s.toCharArray()){
            if(closeopen.containsKey(c)){
                if(!stack.isEmpty() && stack.peek() == closeopen.get(c)){
                    stack.pop();
                }  else {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
           return stack.isEmpty();
        
    }
}
