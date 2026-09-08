class Solution {
    public String reverseByType(String s) {
        Stack<Character> letter = new Stack<>();
        Stack<Character> special = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(Character.isLetter(ch)){
                letter.push(ch);
            }
            else{
                special.push(ch);
            }
        }


        for(char ch : s.toCharArray()){
            if(Character.isLetter(ch)){
                sb.append(letter.pop());
            }
            else{
                sb.append(special.pop());
            }
        }
        return sb.toString();
    }
}