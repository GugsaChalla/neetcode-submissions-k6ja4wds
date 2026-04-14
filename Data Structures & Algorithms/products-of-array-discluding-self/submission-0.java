class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        left[0]=1;
        right[nums.length-1]=1;
        //left
        for(int i=1;i<nums.length;i++){
            left[i]=left[i-1]*nums[i-1];
        }
        //right
        for(int i=nums.length-2;i>-1;i--){
            right[i]=right[i+1]*nums[i+1];
        }
        //res
        for(int i=0;i<nums.length;i++){
            nums[i]=left[i]*right[i];
        }
        return nums;
    }
}  
/**
l=[1,1,2,8]
r=[48,24,6,1]
**/