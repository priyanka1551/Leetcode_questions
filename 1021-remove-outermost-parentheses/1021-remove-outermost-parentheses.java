class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder str=new StringBuilder();
        Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='('){
                if(stack.size()>=1){
                    str.append(ch);
                }
                stack.push(ch);
            }
            else if(ch==')'){
                if(stack.size()>1){
                    str.append(ch);
                }
                stack.pop();
            }
        }
        return str.toString();
    }
}