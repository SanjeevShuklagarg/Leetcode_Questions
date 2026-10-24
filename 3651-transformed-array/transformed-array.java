class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int j = Math.floorMod(i + nums[i], nums.length);
            arr[i] = nums[j];
        }

        return arr;
    }
}