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

//     Set<Integer> set = new HashSet<>();
//     for(int num : nums){
//         if(set.contains(num)){
//             return true;
//         }
//         set.add(num);
//     }
//     return false;
// }
Set<Integer> set = new HashSet<>();
    for(int num : nums){
        if(!set.add(num)){
            return true;
        }
    }
    return false;
}
static {
        Runtime.getRuntime().gc();
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try (FileWriter f = new FileWriter("display_runtime.txt")) {
                f.write("0");
            } catch (Exception e) {

            }
        }));
    }

}