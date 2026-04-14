class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        HashMap<Integer,Integer> map = new HashMap<>();
        PriorityQueue<Map.Entry<Integer,Integer>> heap = new PriorityQueue<>((o1, o2) -> o2.getValue()-o1.getValue());
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
            
        }
        
        heap.addAll(map.entrySet());
        
    
        
        for(int a=0;a<k;a++){
            res[a]= (int)heap.poll().getKey();
        }
        return res;
    }
}