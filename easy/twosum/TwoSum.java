package easy.twosum;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums;
        int target;
        int[] solution;

        nums = new int[]{2, 7, 11, 15};
        target = 9;
        solution = Solution.twoSum(nums, target);
        System.out.println("Array: [2, 7, 11, 15]; Target: 9");
        Solution.print(solution);

        nums = new int[]{3, 2, 4};
        target = 6;
        solution = Solution.twoSum(nums, target);
        System.out.println("\nArray: [3, 2, 4]; Target: 6");
        Solution.print(solution);
    }
}
