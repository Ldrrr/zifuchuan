class Solution {
    public String replaceSpaces(String S, int length) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<length;i++){
            if(S.charAt(i)!=' '){
                sb.append(S.charAt(i));
            }else{
                sb.append("%20");
            }
        }
        return sb.toString();
    }
}
