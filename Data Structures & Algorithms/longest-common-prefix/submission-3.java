class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==1) return strs[0];
        String s=strs[0];
        int p=strs.length;
        for(int i=1;i<strs.length;i++){
           while(!strs[i].startsWith(s)){
    s = s.substring(0, s.length()-1);
}
        }
        return s;
    }
}