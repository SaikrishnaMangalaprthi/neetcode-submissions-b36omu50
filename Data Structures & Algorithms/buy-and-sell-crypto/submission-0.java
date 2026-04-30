class Solution {
    public int maxProfit(int[] prices) {
        int l=0;//buy day
        int r=1;//sell day
        int maxProfit=0;
        int currProfit=0;
        while(r<prices.length){
            if(prices[l]<prices[r]){
                currProfit=prices[r]-prices[l];
                maxProfit=Math.max(maxProfit,currProfit);

            }else l=r;
            r++;
        }
        return maxProfit;
    }
}
