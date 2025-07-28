public class CoinChanges {
    public static int coinChange(int[] coins, int amount) {
        if (amount < 1)
            return 0;

        int[] minCoin = new int[amount + 1];

        for (int i = 1; i <= amount; i++) {
            minCoin[i] = Integer.MAX_VALUE;

            for (int coin : coins) {
                if (coin <= i && minCoin[i - coin] != Integer.MAX_VALUE) {
                    minCoin[i] = Math.min(minCoin[i], 1 + minCoin[i - coin]);
                }
            }
        }

        return minCoin[amount] == Integer.MAX_VALUE ? -1 : minCoin[amount];
    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 11;

        int result = coinChange(coins, amount);
        System.out.println("Minimum coins needed: " + result);
    }
}
