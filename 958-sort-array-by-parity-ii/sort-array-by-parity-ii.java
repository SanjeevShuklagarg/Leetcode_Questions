class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] even = new int[nums.length/2];
        int b=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                even[b]=nums[i];
                b++;
            }
        }
        int[] odd = new int[nums.length/2];
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0){
                odd[c]=nums[i];
                c++;
            }
        }
        int j=0,k=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                nums[i]=even[j];
                j++;
            }else{
                nums[i]=odd[k];
                k++;
            }
        }
        return nums;
    }
}