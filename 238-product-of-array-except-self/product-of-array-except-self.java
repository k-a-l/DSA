class Solution {
    public int[] productExceptSelf(int[] nums) {
        //Brute Force Not acceptable
        int n = nums.length;
        int[] result = new int[n];
    //     for (int i = 0; i < nums.length; i++){
    //         int prod = 1;
    //         for (int j = 0; j < nums.length; j++){
    //             if(i != j){
    //             prod  = prod * nums[j];
    //             result[i] = prod;
    //             }
    //         }
    //     }
    //     return result;
    // }
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        prefix[0] = 1;
        suffix[n-1] = 1;
        //prefix
        for(int i = 1 ; i < n; i++ ){
            prefix[i] = prefix[i-1] * nums[i-1]; 
        }
        //Suffix
        for(int i = n-2; i >= 0; i--){
            suffix[i] = suffix[i+1] * nums[i+1];
        }

        for(int i = 0; i < n ; i++){
            result[i] = prefix[i] * suffix[i];
        }
        return result;

}
}