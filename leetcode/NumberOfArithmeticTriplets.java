class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int lenNums = nums.length;
        int result = 0;

        if (lenNums < 2) {
            return 0;
        }

        for (int i = 0; i < lenNums; i++) {
            for (int j = 1; j < lenNums; j++) {
                for (int j2 = 2; j2 < lenNums; j2++) {
                    if ((nums[j] - nums[i] == diff) && (nums[j2] - nums[j] == diff)) {
                        result++;
                        // System.out.println("k:"+j2+",j:"+j+",i:"+i);
                    }
                } 
            }
        }

        return result; 

    }
}

class TestDriveSolution {
    public static void main(String[] args) {
        Solution test = new Solution();

        int[] nums = {4,5,6,7,8,9};
        int diff = 2;

        System.out.println(test.arithmeticTriplets(nums, diff));
    }
}

