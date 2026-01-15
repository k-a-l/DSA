class Solution {
    public boolean containsDuplicate(int[] nums) {
    //     Array.sort(nums);
    //     for(int i = 0; i < nums.length -1; i++){
    //             if( nums[i] == nums[i+1] ){
    //             return true;
    //         }
    //     }
    //     return false;
    // }

    // Map<Integer, Integer> map = new HashMap<>(); //O(n)
    // for(int i = 0; i < nums.length; i++){ //O(n)
    //     if(map.containsKey(nums[i])){
    //         return true;
    //     }
    //     map.put(nums[i], i);
    // }
    // return false;
    // }

    Set<Integer> set = new HashSet<>();
    for(int num : nums){
        if(set.contains(num)){
            return true;
        }
        set.add(num);
    }
    return false;
}
}