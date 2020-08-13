class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] str = sentence.split(" ");
        int len = searchWord.length();
        for(int i=0;i<str.length;i++){
            if(str[i].length()>=len&&str[i].indexOf(searchWord) == 0)
            {
                return i+1;
            }
        }
        return -1;
    }
}
