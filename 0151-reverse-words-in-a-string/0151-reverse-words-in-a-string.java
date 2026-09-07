class Solution {
    public String reverseWords(String s) {

        String rev[]=s.trim().split("\\s+");
        String sentence="";

        for(int i=rev.length-1;i>=0;i--){
          sentence+=rev[i]+" ";
        }
        return sentence.trim();
        
    }
}