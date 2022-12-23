class Solution {
    public boolean isGoodArray(int[] nums) {
        int res = nums[0];
        for(int i=1;i<nums.length;i++)
                res = gcd(res,nums[i]);
        return res==1;
        
    }
    private int gcd(int a ,int b){
        if(b==0)
         return a;
        return gcd(b,a%b);
    }
}