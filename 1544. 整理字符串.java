class Solution {
    public String makeGood(String s) {
        if(s==null||s.length()==0) return "";
        StringBuilder sb = new StringBuilder(s);
        int len = -1;
        while(len!=sb.length()){
            len = sb.length();
            for(int i=0;i<sb.length()-1&&sb.length()>1;){
            if(Math.abs(sb.charAt(i)-sb.charAt(i+1))=='a'-'A'){
                sb.delete(i,i+2);
            }else{
                i++;
            }
        }
        }
        return sb.toString();
    }
}
