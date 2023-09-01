Question 1: Two Sum

import java.util.*;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numToIndex.containsKey(complement)) {
                return new int[]{numToIndex.get(complement), i};
            }
            numToIndex.put(nums[i], i);
        }
        
        return null;
    }

    public static void main(String[] args) {
        TwoSum solution = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        System.out.println(Arrays.toString(result)); // Output: [0, 1] (because nums[0] + nums[1] == 9)
    }
}

Question 2: Reverse Integer

  public class ReverseInteger {
    public int reverse(int x) {
        final int INT_MAX = Integer.MAX_VALUE;
        final int INT_MIN = Integer.MIN_VALUE;
        
        long reversedX = 0;
        
        while (x != 0) {
            int digit = x % 10;
            reversedX = reversedX * 10 + digit;
            if (reversedX > INT_MAX || reversedX < INT_MIN) {
                return 0;
            }
            x /= 10;
        }
        
        return (int) reversedX;
    }

    public static void main(String[] args) {
        ReverseInteger solution = new ReverseInteger();
        int x = 123;
        int reversed = solution.reverse(x);
        System.out.println(reversed); // Output: 321
    }
}
