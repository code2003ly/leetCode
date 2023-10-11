package questioOfTheDay.Oct;
//121.买卖股票最佳时期
public class LC121 {
    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        //存储最低价买入
        int min = prices[0];
        int ans = 0;
        for(int i =1;i<prices.length;i++){
            int temp = prices[i];
            if(temp<=min) min = temp;
            else ans = Math.max(ans,temp-min);
        }
        return  ans;
    }
}
