class Solution {
    public boolean isValid(String s) {
        Stack<Character>stack = new Stack<>();
        for(char c: s.toCharArray()){
            if(c=='('||c=='{' ||c=='['){
                 stack.push(c);
            } else
            {
                // If stack is empty, there is no matching opening bracket
                if (stack.isEmpty()) return false;
                
                // Pop the top and check if it matches the current closing bracket
                char top = stack.pop();
                if (!isMatching(top, c)) return false;
            }
        }
        return stack.isEmpty();
    }

    private boolean isMatching(char open, char close){
        return(open == '(' && close == ')'|| open == '[' && close == ']' || open == '{'&& close =='}' );
    }
}