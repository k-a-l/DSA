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
    int index = 0;
    // for(int i = 0; i < nums.length; i++){
    //     // if(min > nums[i]){
    //     //     min = nums[i];
    //     // }
    //     // min = min > num ? num : min;
    //     min = Math.min(min, nums[i]);
    //     index = i;


    // }
    // System.out.println(index);
    // return min;

        int left = 0;
        int right = nums.length - 1;

        while(left < right){
            int mid = left + (right - left) / 2; //compute same as right - left but safely 2left+right−left​=2left+right
            if(nums[mid] < nums[right]){
                right = mid;
            }else{
                left = mid + 1;
            }
        }
    return nums[left];
  }
    
}