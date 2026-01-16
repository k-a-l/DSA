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
        int maxSum = Integer.MIN_VALUE;
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

        int currentSum = 0;
        for(int i = 0; i < n; i++){
            currentSum += nums[i];
            maxSum = Math.max(currentSum, maxSum);
            if(currentSum < 0){
                currentSum = 0;
            }
        }
        return maxSum;
    }
}