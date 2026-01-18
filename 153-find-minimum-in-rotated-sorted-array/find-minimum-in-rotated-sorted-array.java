class Solution {
    public int findMin(int[] nums) {
    // int l = 0;
    // int r = nums.length - 1;

    // while (l < r) {
    //   final int m = (l + r) / 2;
    //   if (nums[m] < nums[r])
    //     r = m;
    //   else
    //     l = m + 1;
    // }

    // return nums[l];

    //Simple brute force
    int min = nums[0];
    for(int num : nums){
        // if(min > nums[i]){
        //     min = nums[i];
        // }
        min = min > num ? num : min;
    }
    return min;
  }
    
}