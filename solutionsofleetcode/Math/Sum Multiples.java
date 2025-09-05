class Solution {
    public int sumOfMultiples(int n) {
        if(n<=1){
            return 0;
        }
        int sum=0;
        for(int i=2;i<=n;i++){
            if(i%3==0 || i%5==0 || i%7==0){
                sum=sum+i;
            }
        }
        return sum;
    }
}