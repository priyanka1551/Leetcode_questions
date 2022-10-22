class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(!stack.empty() && stack.peek()==ch){
                stack.pop();
            }
            else if(stack.empty() || stack.peek()!=ch ){
                stack.push(ch);
            }
        }
        StringBuilder res=new StringBuilder();
        while(!stack.empty()){
            res.append(stack.peek());
            stack.pop();
        }
        return res.reverse().toString();
    }
}