/**
 * 1. Two Sum (Easy)
 * <p>
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to
 * target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * You can return the answer in any order.
 *
 * @author Jonathan Manzano
 * @version Java 21 OpenJDK
 */
package easy.twosum;

import java.util.Map;
import java.util.HashMap;

public class Solution {
  public static void print(int[] solution) {
    System.out.print("[");
    for (int i = 0; i < solution.length; i++) {
      if (i == 1) {
        System.out.print(solution[i]);
      } else {
        System.out.print(solution[i] + ", ");
      }
    }
    System.out.println("]");
  }

  public static int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> numMap = new HashMap<>(nums.length);
    int n = nums.length;

    for (int i = 0; i < n; i++) {
      int complement = target - nums[i];
      if (numMap.containsKey(complement)) {
        return new int[] {numMap.get(complement), i};
      }
      numMap.put(nums[i], i);
    }

    return new int[] {}; // No solution found
  }
}
