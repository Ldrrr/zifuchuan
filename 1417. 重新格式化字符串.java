class Solution {
    public String reformat(String s) {
        int a=0,b=0;
        for(char c : s.toCharArray()){
            if(c>='0'&&c<='9'){
                a++;
            }else if(c>='a'&&c<='z'){
                b++;
            }
        }
        int res = a-b;
        if(Math.abs(res)>1){
            return "";
        }
        int i=0,j=1;
        char[] ch = new char[s.length()];
        if(res>0){
            for(char c : s.toCharArray()){
                if(Character.isDigit(c)){
                    ch[i] = c;
                    i+=2;
                }else{
                    ch[j] = c;
                    j+=2;
                }
            }
        }else{
             for(char c : s.toCharArray()){
                if(Character.isDigit(c)){
                    ch[j] = c;
                    j+=2;
                }else{
                    ch[i] = c;
                    i+=2;
                }
            }

        }
        return new String(ch);
    }
}
