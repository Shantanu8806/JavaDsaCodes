class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        int n=cost.length-1,m=cost.length-2;
        for(int i=0;i<cost.length;i++)
            if(i<2)
              dp[i]=cost[i];
            else
              dp[i]=cost[i]+Math.min(dp[i-1],dp[i-2]);         
      return Math.min(dp[n],dp[m]);
    }
}
