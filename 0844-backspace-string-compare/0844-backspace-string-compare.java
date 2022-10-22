class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1=new Stack<Character>();
        Stack<Character> stack2=new Stack<Character>();
        for(char c:s.toCharArray()){
            if(c!='#'){
                stack1.push(c);
            }
            else if(!stack1.empty()){
                stack1.pop();
            }
        }
        for(char d:t.toCharArray()){
            if(d!='#'){
                stack2.push(d);
            }
            else if(!stack2.empty()){
                stack2.pop();
            }
        }
        return (String.valueOf(stack1).equals(String.valueOf(stack2)));
    }
}