class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        HashMap<Integer,List<String>> map = new HashMap<>();

        for(String str: strs){
            int[] chars = new int[26];
            for(char c: str.toCharArray()){
                chars[c-97]++;
            }
            int hashCode = Arrays.hashCode(chars);
            if(map.containsKey(hashCode)){
                map.get(hashCode).add(str);
            }
            else {
                List<String> anagrams = new ArrayList<>(Arrays.asList(str));
                map.put(hashCode,anagrams);
                res.add(anagrams);
            } 
        }
    return res;

    }
}
