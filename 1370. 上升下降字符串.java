class Solution {
    public String sortString(String s) {
        StringBuilder sb = new StringBuilder();
        int[] map = new int[26];
        for(char c : s.toCharArray()){
            map[c-'a']++;
        }
        int k=0;
        while(k<s.length()){
            for(int i=0;i<26;i++){
                if(map[i]>0){
                    k++;
                    map[i]--;
                    sb.append((char)(i+'a'));
                }
            }
            for(int i=25;i>=0;i--){
                if(map[i]>0){
                    k++;
                    map[i]--;
                    sb.append((char)(i+'a'));
                }
            }
        }
        return sb.toString();
    }
}
