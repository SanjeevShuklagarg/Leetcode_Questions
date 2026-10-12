class Solution {
    public void rotate(int[] nums, int k) {
        if(k==0){
            return;
        }else{
            if(k>nums.length){
                k=k%nums.length;
            }
            int[] arr = new int[nums.length];
            int j=0;
            for(int i=nums.length-k;i<nums.length;i++){
                arr[j]=nums[i];
                j++;
            }
            for(int i=0;i<(nums.length-k);i++){
                arr[j] = nums[i];
                j++;
            }
            for(int i=0;i<arr.length;i++){
                nums[i] = arr[i];
            }
             return;
        }
    }
}