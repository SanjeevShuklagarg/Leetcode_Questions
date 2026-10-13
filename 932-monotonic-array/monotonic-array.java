class Solution {
    public boolean isMonotonic(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i] = nums[i];
        }
        Arrays.sort(arr);
        if(Arrays.equals(nums, arr)){
            return true;
        }else{
            int j=nums.length-1;
            int count=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]==arr[j]){
                    count++;
                }
                j--;
            }
            if(count==nums.length){
                return true;
            }
            return false;
        }
    }
}