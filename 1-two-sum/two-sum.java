import java.util.HashMap;
import java.util.Map;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        //     //1. Brute Force
        //     for (int i = 0; i < nums.length; i++)  
        //         for (int j = i + 1; j < nums.length; j++) {
        //             if (nums[i] + nums[j] == target) {
        //                 return new int[] { i, j };
        //             }
        //         }
        //     return new int[] {};
        // }

        // 2. Two pass Hash Table
        //Complement is the next value which needs to be in there to reach the target
    //     Map<Integer, Integer> map = new HashMap<>();
    //     for (int i = 0; i < nums.length; i++) {
    //         map.put(nums[i], i);
    //     }
    //     for (int i = 0; i < nums.length; i++) {
    //         int complement = target - nums[i];
    //         if (map.containsKey(complement) && map.get(complement) != i) {
    //             return new int[] { i, map.get(complement) };
    //         }

    //     }
    //     return new int[] {};

    // }

    //One pass Hash Table simultaneously
//     HashMap<Integer, Integer> map = new HashMap<>(); //Hashmap is optimize for Key O(1)
//     for(int i = 0; i < nums.length; i++){
//         int complement = target - nums[i];
//         if(map.containsKey(complement)){
//             return new int[]{map.get(complement), i};
//         }
//         map.put(nums[i], i);
//     }
//             return new int[]{-1,-1};


// }

    HashMap<Integer, Integer> map = new HashMap<>(); //Hashmap is optimize for Key O(1)
    for (int i = 0; i < nums.length; i++){
        int remainingFinalValue = target - nums[i]; //nums[i] -> initial value
        if(map.containsKey(remainingFinalValue)){
            return new int[]{map.get(remainingFinalValue), i};
        }
        map.put(nums[i], i); //keeping value as the key and the index as the value [key:value] = [value : index]

    }
    return new int[]{-1,-1};
}
}