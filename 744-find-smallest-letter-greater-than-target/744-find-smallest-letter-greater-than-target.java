class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int a=target;
        for(char ele:letters){
            int element=ele;
            if(element>a){
                return ele;
            }
        }
        return letters[0];
    }
}