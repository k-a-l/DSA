class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //Bruteforce method
    //     List<List<Integer>> result = new ArrayList<>();
    //     for(int i = 0; i < nums.length-2; i++){
    //         for(int j = i + 1; j < nums.length-1; j++){
    //             for(int k = j + 1; k < nums.length; k++){
    //                 if(nums[i] + nums[j] + nums[k] == 0){
    //                     List<Integer> triplets = new ArrayList<>();
    //                     triplets.add(nums[i]);
    //                     triplets.add(nums[j]);
    //                     triplets.add(nums[k]);
    //                     Collections.sort(triplets);
    //                     result.add(triplets);

    //                 }
    //             }
    //         }
    //     }
    //     Set<List<Integer>> allResultTriplets = new HashSet<>(result);
    //     return new ArrayList<>(allResultTriplets);
    // }
    // Set<List<Integer>> unique = new HashSet<>();

    //     for (int i = 0; i < nums.length - 2; i++) {
    //         Set<Integer> seen = new HashSet<>();

    //         for (int j = i + 1; j < nums.length; j++) {
    //             int third = -nums[i] - nums[j];

    //             if (seen.contains(third)) {
    //                 List<Integer> triplet = Arrays.asList(nums[i], nums[j], third);
    //                 Collections.sort(triplet);
    //                 unique.add(triplet);
    //             }

    //             seen.add(nums[j]);
    //         }
    //     }

    //     return new ArrayList<>(unique);
    // }
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int i,j,k;
        for(i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            j=i+1; k=nums.length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum > 0) k--;
                else if(sum < 0) j++;
                else{
                    List<Integer> l = new ArrayList<>();
                    l.add(nums[i]);
                    l.add(nums[j]);
                    l.add(nums[k]);
                    res.add(l);
                    k--;
                    j++;

                    while(j<k && nums[j]==nums[j-1]) j++;
                }
            }
        }
        return res;
    }
}