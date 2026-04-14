class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            int start =i+1;
            int end = nums.length-1;
            while(start<end){
                if(nums[start]+nums[end]+nums[i] == 0) {
                    list.add(new ArrayList<Integer>(Arrays.asList(nums[start],nums[end],nums[i])));
                    start++;
                    end--;
                    while(start<end && nums[start] == nums[start-1]) start++;
                }
                else if(nums[start]+nums[end]+nums[i] > 0) end--;
                else if(nums[start]+nums[end]+ nums[i] < 0) start++;
            }
        }

        return list;
    }
}

//[-4,-1,-1,0,1,2]



      




