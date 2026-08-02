class Solution {

    // Function to calculate maximum profit using brute force
    public int stockbuySell(int[] prices) {

        // Initialize maximum profit to 0
        int maxProfit = 0;

        // Choose each day as a buying day
        for (int i = 0; i < prices.length; i++) {

            // Choose each future day as a selling day
            for (int j = i + 1; j < prices.length; j++) {

                // Calculate profit
                int profit = prices[j] - prices[i];

                // Update maximum profit
                maxProfit = Math.max(maxProfit, profit);
            }
        }

        // Return maximum profit
        return maxProfit;
    }
}


public class StockBuySell {

    public static void main(String[] args) {

        Solution sol = new Solution();

        int[] prices = {7, 1, 5, 3, 6, 4};

        System.out.println("Max Profit: " + sol.stockbuySell(prices));
    }
}