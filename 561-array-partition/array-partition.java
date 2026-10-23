class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        for(int i=0;i<nums.length;i=i+2){
            if(nums[i]<nums[i+1]){
                count +=nums[i];
            }else if(nums[i]>nums[i+1]){
                count+=nums[i+1];
            }else{
                count+=nums[i];
            }
        }
        return count;
    }
}