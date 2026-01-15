class Solution {
    public int maxProfit(int[] prices) {
        // int min = Integer.MAX_VALUE;
        int buy = prices[0];
        int maxProfit = 0;
    //     for (int i = 0; i < prices.length; i++) {
    //         if (prices[i] < min) {
    //             min = prices[i];
    //         }
    //         int currentProfit = prices[i] - min;
    //         if (currentProfit > maxProfit) {
    //             maxProfit = currentProfit;
    //         }
    //     }
    //     return maxProfit;
    // }
//     for (int price : prices){
//         if(price < min){
//             min = price;
//         }else{
//             maxProfit = Math.max(maxProfit, price - min);
//         }
//     }
//     return maxProfit;
// }
for(int i = 0; i < prices.length; i++){
    if(buy > prices[i]){
        buy = prices[i];
    }else if(prices[i] - buy > maxProfit){
        maxProfit = prices[i] - buy;
    }

}
return maxProfit;
}
}