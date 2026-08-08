class Solution {

    public String longestCommonPrefix(String[] strs) {
        String prefix="";
        int n=strs.length;
        Arrays.sort(strs);

        for(int i=0;i<strs[0].length();i++){
            if(strs[0].charAt(i)!=strs[n-1].charAt(i)){
                break;
            }
            prefix+=strs[0].charAt(i);
        }
        return prefix;
    }
}