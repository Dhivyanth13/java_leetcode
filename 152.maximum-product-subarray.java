class Solution {
    public int maxProduct(int[] nums) {
    int maxSoFar = nums[0], minSoFar = nums[0], result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            if (num < 0) {
                int temp = maxSoFar; maxSoFar = minSoFar; minSoFar = temp;
            }
            maxSoFar = Math.max(num, maxSoFar * num);
            minSoFar = Math.min(num, minSoFar * num);
            result = Math.max(result, maxSoFar);
        }
        return result;
    }
}