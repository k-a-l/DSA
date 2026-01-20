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
    Set<List<Integer>> unique = new HashSet<>();

        for (int i = 0; i < nums.length - 2; i++) {
            Set<Integer> seen = new HashSet<>();

            for (int j = i + 1; j < nums.length; j++) {
                int third = -nums[i] - nums[j];

                if (seen.contains(third)) {
                    List<Integer> triplet = Arrays.asList(nums[i], nums[j], third);
                    Collections.sort(triplet);
                    unique.add(triplet);
                }

                seen.add(nums[j]);
            }
        }

        return new ArrayList<>(unique);
    }
}