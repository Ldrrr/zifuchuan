class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] letter = new int[26];
        for(char c : text.toCharArray()){
            letter[c-'a']++;
        }
        letter['l'-'a']/=2;
        letter['o'-'a']/=2;

        int min = Integer.MAX_VALUE;
        for(char c : "balon".toCharArray()){
            if(letter[c-'a']<min){
                min = letter[c-'a'];
            }
        }
        return min;
    }
}
