class Solution {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] answer = new int[queries.length];
        for(int i=0;i<queries.length;i++){
            for(int j=0;j<words.length;j++){
                if(f(queries[i])<f(words[j])){
                    answer[i]++;
                }
            }
        }
        return answer;

    }
    public int f(String s){
      char c = s.charAt(0);
      int cnt = 1;
      for(int i=1;i<s.length();i++){
          if(c==s.charAt(i)){
              cnt++;
          }else if(s.charAt(i)<c){
              c=s.charAt(i);
              cnt=1;
          }
      }
      return cnt;
    }
}
