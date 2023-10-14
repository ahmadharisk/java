/**
 * TwoSum
 */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int i = 0, j = 1, numsLength = nums.length;

        while (i < numsLength) {
            if (j == numsLength) {
                i++;
                j = i + 1;
            }
            if((j < numsLength) && (i < numsLength)) {
                if (nums[i] + nums[j] == target) {
                    break;
                }
            }
            j++;
        }

        return new int[] {i,j};
    }

    public static void main(String[] args) {
        int[] nums = {0,4,3,0};
        int target = 0;
        System.out.println(java.util.Arrays.toString(twoSum(nums, target)));
    }
}