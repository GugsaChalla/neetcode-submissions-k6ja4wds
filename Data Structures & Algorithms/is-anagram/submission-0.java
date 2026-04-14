class Solution {
    public boolean isAnagram(String s, String t) {
        int[] mapS = new int[26];
        int[] mapT = new int[26];
        for(int i=0;i<s.length();i++) {
            mapS[s.charAt(i)-97]++;
        }
        for(int i=0;i<t.length();i++) {
            mapT[t.charAt(i)-97]++;
        }
        if(Arrays.hashCode(mapS) == Arrays.hashCode(mapT)) return true;
        return false;
    }
}
