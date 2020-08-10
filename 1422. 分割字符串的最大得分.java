class Solution {
    public int maxScore(String s) {
        int res=0,cnt0=0,cnt1=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                cnt1++;
            }
        }

        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='0'){
                cnt0++;
            }else{
                cnt1--;
            }
            res = Math.max(res,cnt0+cnt1);
        }
        return res;
    }
}
