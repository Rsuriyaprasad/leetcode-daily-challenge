class Solution {
    public boolean canCross(int[] stones) {
      int n = stones.length;
      int jump,i=1,j=0;
      boolean[][] dp = new boolean[n][n+1];
      dp[0][1]= true;

      for( i=1;i<n;i++) {
       for( j=0;j<i;j++) {
        jump = stones[i] - stones[j];
         if (jump <= j+1)
         {
             dp[i][jump] = dp[j][jump-1]||dp[j][jump]||dp[j][jump+1];
             if(i == n-1 && dp[i][jump]) 
              return true;
         }
       }
      }
          return false;

    }
}
