package org.example;

public class sellStocksMaxProfit {
    public static void main(String[] args){
        int[] price = new int[]{7,1,5,3,6,4,100, 200, 50};
        int n = price.length;
        System.out.println(maxProfit(price, 0, n));
    }
    public static int maxProfit(int price[],int start,int end){
        int profit =0;
        if (end<=start) {
            return profit;
        }
        for(int i=0; i<end; i++){
            for(int j=i+1; j<end; j++){
                if(price[j]>price[i]){
                    int curr_profit = price[j] - price[i];
                    profit = Math.max(profit, curr_profit);
                }
            }
        }
        return profit;
    }
}
