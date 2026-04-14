class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int maxLen =0;
        for(int num: nums) set.add(num);

        for(int num: nums){
            //already visited
        if(!set.contains(num)) continue;
        set.remove(num);//c=4
        int lower = set.contains(num-1)? countLowerSeq(num-1,set)+1 : 0; //2
        int higher = set.contains(num+1)? countHigherSeq(num+1,set)+1 : 0;//2
        int currLen = higher+lower+1;
        maxLen = Math.max(maxLen,currLen);//2
        }

        return maxLen;

    
    }

    public int countLowerSeq(int curr,HashSet<Integer> set){
        if(set.contains(curr)) set.remove(curr);
        if(set.contains(curr-1)){
            return countLowerSeq(curr-1,set)+1;
        }
        return 0;
    }

    public int countHigherSeq(int curr,HashSet<Integer> set){
        if(set.contains(curr)) set.remove(curr);
        if(set.contains(curr+1)){
            return countHigherSeq(curr+1,set)+1;
        }
        return 0;
    }
}


/**
[0,1,-1,4,5,6]
 i
curr=0
seq=1
{}
**/