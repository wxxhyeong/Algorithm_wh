public class leet122 {

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{2,1,2,0,1}));
    }
    static public int maxProfit(int[] prices) {

        int cur = prices[prices.length - 1];
        int result = 0;

        for (int i = prices.length - 2; i >= 0; i--) {
            if (prices[i] > cur)
                cur = prices[i];
            else {
                result += cur - prices[i];
                cur = prices[i];
            }
        }

        return result;



    }
}
