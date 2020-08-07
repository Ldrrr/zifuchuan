class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        for(int i=chars.length-1;i>=0;i--){
            if(chars[i]!='#'){
                sb.append((char)(chars[i]+48));
            }else{
                sb.append((char)((chars[--i]-48)+(chars[--i]-48)*10+96));
            }
        }
        return sb.reverse().toString();
    }
}
