package Day06;

public class BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices){
        int min=prices[0];
        int profit=0;
        for (int i = 0; i < prices.length; i++) {
            if(prices[i]<min)
               min=prices[i];
            profit=Math.max(profit,prices[i]-min);
        }
        return profit;
    }
    public static void main(String[] args) {
        BestTimetoBuyandSellStock obj=new BestTimetoBuyandSellStock();
        int[] arr={7,1,5,3,6,4};
        System.out.println(obj.maxProfit(arr));
    }
}
