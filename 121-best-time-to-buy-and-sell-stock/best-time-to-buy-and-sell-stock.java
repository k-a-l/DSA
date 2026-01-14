class Solution {
    public int maxProfit(int[] prices) {

        //Worst practice Cause -> Memeory and Time Excess

        // // List<Integer> list = new ArrayList<>();
        // Map<Integer, Integer> map = new HashMap<>();

        // for(int i = 0; i< prices.length; i++){
        //     for(int j = i+1; j < prices.length; j++){
        //         int max = prices[j] - prices[i];
        //         map.put(max, i);
        //         // list.add(max);
        //     }
        // }
        //     int maxProfit = 0;
        //     for(int profit : map.keySet()){
        //         if(profit > maxProfit){
        //             maxProfit = profit;
        //         }
        //     }
        //     return maxProfit;
        // }


        //One Pass Solution
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            }
            int currentProfit = prices[i] - min;
            if(currentProfit > maxProfit){
                maxProfit = currentProfit;
            }

        }
                    return maxProfit;

    }
        
}