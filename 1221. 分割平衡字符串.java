class Solution {
    public int balancedStringSplit(String s) {
        int n = 0;
        int num = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='R') n++;
            if(s.charAt(i)=='L') n--;
            if(n==0) num++;
        }
        return num;
    }
}
