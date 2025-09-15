package org.example.twoSum;

import java.util.HashMap;
import java.util.Map;

class Solution {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int number = nums[i];
            if(map.containsKey(target - number)) {
                return new int[]{map.get(target - number), i};
            }
            map.put(number, i);
        }
        return null;
    }
}