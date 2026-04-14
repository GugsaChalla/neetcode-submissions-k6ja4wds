class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int first =0, second =0;
        int max =0;
        while(second<s.length()) {
            if(set.contains(s.charAt(second))){
                set.remove(s.charAt(first));
                first++;
            }
            else {
            set.add(s.charAt(second));
            second++;
            }
            max = Math.max(max,second-first);
        }
        return max;
    }
}




