class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0; 
        int sum = 0;
        for(int i=0; i<accounts.length; i++){
            for(int j=0; j<accounts[0].length; j++){
                sum = sum + accounts[i][j];  // row sum   
            }
            maxWealth = Math.max(sum, maxWealth);
            sum = 0;
        }
        return maxWealth;
    }
}