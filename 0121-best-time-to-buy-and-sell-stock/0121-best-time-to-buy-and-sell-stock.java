class Solution {
    public int maxProfit(int[] prices) {
       int minPrice=Integer.MAX_VALUE;
       int maxProfit=0;

       for(int i=0;i<prices.length;i++){
          int price=prices[i];

        if(minPrice>price){
            minPrice=price;
            
        }

        int profit=price-minPrice;

        if(profit>maxProfit){
            maxProfit=profit;
        }





       }





        return maxProfit;
    }




}