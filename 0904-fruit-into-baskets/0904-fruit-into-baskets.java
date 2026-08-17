class Solution {
    public int totalFruit(int[] fruits) {

        Map<Integer,Integer> basket=new HashMap<>();
        int left =0;
        int right=0;
        int maxFruits=0;
        int n=fruits.length;

        for(right=0;right<n;right++){
            int currentCount= basket.getOrDefault(fruits[right],0);
            basket.put(fruits[right],currentCount+1);

            //if basket has more than two types of fruit start empting basket

            while(basket.size()>2){
                int fruitsCount = basket.get(fruits[left]);
                if(fruitsCount==1)
                   basket.remove(fruits[left]);
                else
                   basket.put(fruits[left],fruitsCount-1);
                left++;
            }
            maxFruits=Math.max(maxFruits,right-left+1);
        }
        return maxFruits;
        
    }
}