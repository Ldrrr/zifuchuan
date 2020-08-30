class Solution {
    public String reverseWords(String s) {
        String[] strs = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<strs.length-1;i++){
            sb.append(new StringBuilder(strs[i]).reverse().toString());
            sb.append(" ");
        }
        sb.append(new StringBuilder(strs[strs.length-1]).reverse().toString());
        return sb.toString();

    }
}
