public class BuySellStocks {
    public static void MaxProfit(int value[]) {
        int buystock=Integer.MAX_VALUE;
        int MaxProfit=0;
        for (int i=0; i<value.length; i++) {
            if(buystock<value[i]){
                int profit=value[i]-buystock;
                MaxProfit=Math.max(MaxProfit, profit);
            }
            else{
                buystock=value[i];
            }}
            System.out.println(MaxProfit);
        }
    public static void main(String[] args){
        int stock[] = {7,1,5,3,6,4};
        MaxProfit(stock);

    }
}
