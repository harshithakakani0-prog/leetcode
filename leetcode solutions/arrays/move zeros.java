class Solution {
    public void moveZeroes(int[] nums) {
        int m=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int k=0;
                k=nums[i];
                nums[i]=nums[m];
                nums[m]=k;
                m++;
            }
        }
    }
}
