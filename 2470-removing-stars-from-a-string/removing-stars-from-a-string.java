class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0;i<s.length();i++){
            if(st.isEmpty()){
                st.push(s.charAt(i));
            }
            else if(s.charAt(i) == '*'){
                st.pop();
                continue;
            }else{
                st.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char ch : st){
            sb.append(ch);
        }
        return sb.toString();
         
    }
}