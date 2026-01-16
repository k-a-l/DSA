class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        //Print all sub arrays
        // for(int i = 0; i < n; i++){
        //     for(int j = i; j < n; j++){
        //         for(int k = i; k <= j; k++){
        //             System.out.print(nums[k]);
        //         }
        //         System.out.pritn("");
        //     }
        //     System.out.println();
        // }

    //O(n2) not acceptable
        int maxSum = nums[0];
        // for(int st = 0; st < n; st++){
        //     int currentSum = 0;
        //     for(int end = st; end < n; end++){
        //         currentSum = currentSum + nums[end];
        //         if(currentSum > maxSum){                   // maxSum = Math.max(maxSum, currentSum);

        //             maxSum = currentSum;
        //         }
        //     }
        // }
        // return maxSum;

        int currentSum = nums[0];
        // for(int i = 0; i < n; i++){
        //     currentSum += nums[i];
        //     maxSum = Math.max(currentSum, maxSum);
        //     if(currentSum < 0){
        //         currentSum = 0;
        //     }
        // }
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}