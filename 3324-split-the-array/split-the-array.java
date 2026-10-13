class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int[] freq = new int[2000];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        for(int i=0;i<nums.length;i++){
            if(freq[nums[i]]>=3){
                return false;
            }
        }
        return true;
    }
}