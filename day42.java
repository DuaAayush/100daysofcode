import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}


import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        Map<Character, Integer> charIndexMap = new HashMap<>();
        int start = 0;

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);
            if (charIndexMap.containsKey(currentChar)) {
                start = Math.max(start, charIndexMap.get(currentChar) + 1);
            }
            charIndexMap.put(currentChar, end);
            maxLength = Math.max(maxLength, end - start + 1);
        }
        
        return maxLength;
    }
}
