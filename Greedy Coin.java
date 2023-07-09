import java.util.Arrays;

public class GreedyCoinChange {
    public static void main(String[] args) {
        int[] coins = {25, 10, 5, 1};
        int amount = 68;

        int[] result = getMinCoins(coins, amount);
        System.out.println("Minimum number of coins needed: " + result[amount]);
        System.out.print("Coins used: ");
        printCoinsUsed(result, coins);
    }

    public static int[] getMinCoins(int[] coins, int amount) {
        int[] coinCount = new int[amount + 1];
        Arrays.fill(coinCount, Integer.MAX_VALUE); // Initialize all values to a large number
        coinCount[0] = 0; // No coins needed for amount 0

        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (coin <= i && coinCount[i - coin] + 1 < coinCount[i]) {
                    coinCount[i] = coinCount[i - coin] + 1;
                }
            }
        }

        return coinCount;
    }

    public static void printCoinsUsed(int[] coinCount, int[] coins) {
        int amount = coinCount.length - 1;
        while (amount > 0) {
            for (int coin : coins) {
                if (coin <= amount && coinCount[amount] == coinCount[amount - coin] + 1) {
                    System.out.print(coin + " ");
                    amount -= coin;
                    break;
                }
            }
        }
        System.out.println();
    }
}
