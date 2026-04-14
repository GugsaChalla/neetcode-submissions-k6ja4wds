class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        HashSet<Integer> set = new HashSet<>();
        int max =1;
        for(int num: nums) set.add(num);

        for(int num: nums) {
            int count =1;
            while(set.contains(num+1)) {
                count++;//2
                num+=1;
            }
            max = Math.max(count,max);
        }
        return max;
    }
}
