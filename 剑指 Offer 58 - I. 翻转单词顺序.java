class Solution {
    public String reverseWords(String s) {
        String[] Strings = s.trim().split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=Strings.length-1;i>=0;i--){
            if(Strings[i].equals("")) continue;
            if(i==0){
                sb.append(Strings[i]);
            }else{
                sb.append(Strings[i]).append(" ");
            }
        }
        return sb.toString();
    }
}
