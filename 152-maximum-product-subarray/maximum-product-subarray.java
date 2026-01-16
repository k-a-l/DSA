class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int leftProd = 1;
        int rightProd = 1;
        int result = nums[0];

        for(int i = 0; i < n; i++){
            leftProd = leftProd == 0 ? 1 : leftProd;
            rightProd = rightProd == 0 ? 1 : rightProd;

            leftProd = leftProd * nums[i];
            rightProd = rightProd * nums[n-i-1];

            result = Math.max(result,Math.max(rightProd, leftProd));
        }
            
        return result;
        
    }
}