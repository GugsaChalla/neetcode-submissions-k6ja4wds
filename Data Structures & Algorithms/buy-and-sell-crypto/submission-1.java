class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length ==0) return 1;
        int first =0, second =1,max =0;
        while(second < prices.length) {
            if(prices[first]>=prices[second]){
                first=second;
            }
            max = Math.max(max,prices[second]-prices[first]);
            second++;



        }

        return max;
    }
}

