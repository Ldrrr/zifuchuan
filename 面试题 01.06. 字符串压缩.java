class Solution {
    public String compressString(String S) {
        if(S==null||S.length()==0) return S;
        StringBuilder sb = new StringBuilder();
        int times = 1;
        int i;
        for(i=1;i<S.length();i++){
            if(S.charAt(i)==S.charAt(i-1)){
                times++;
            }else{
                sb.append(S.charAt(i-1)).append(times);
                times = 1;
            }
        }
        sb.append(S.charAt(i-1)).append(times);
        if(S.length()<=sb.length()) return S;
        else return sb.toString();
    }
}
