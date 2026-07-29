class Solution {
    public String reverseWords(String s) {
        String[] x = s.strip().split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = x.length-1;i>=0;i--){
            if(!x[i].trim().isEmpty()){
                sb.append(x[i].trim()).append(" ");
            }
        }        
        return sb.toString().trim();
    }
}