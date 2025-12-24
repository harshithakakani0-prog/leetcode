class Solution {
    public int[] getConcatenation(int[] nums) {
       int n=nums.length;
       int[] n1=new int[2*n];
        for(int i=0;i<n;i++){
           n1[i]=nums[i];
           n1[n+i]=nums[i];
        }
        return n1;
    }
}
