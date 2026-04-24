class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb=new StringBuilder();
        int w1 = word1.length();
        int w2 = word2.length();
        int l = Math.min(w1, w2);
        for(int i=0;i<l;i++){
            sb.append(word1.charAt(i)).append(word2.charAt(i));
        }
         if (w1 == w2) {
            return sb.toString();
        } else if (w1 > w2) {
            return sb.append(word1.substring(l)).toString();
        } else {
            return sb.append(word2.substring(l)).toString();
        }
      
    }
}