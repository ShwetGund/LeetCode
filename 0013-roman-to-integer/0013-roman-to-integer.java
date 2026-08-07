class Solution {
    public int romanToInt(String s) {

       HashMap<Character,Integer>hm=new HashMap<>();

       hm.put('I',1);
       hm.put('V',5);
       hm.put('X',10);
       hm.put('L',50);
       hm.put('C',100);
       hm.put('D',500);
       hm.put('M',1000);

       int sum=0;

       sum+=hm.get(s.charAt(0));

       for(int i=1;i<s.length();i++){
        sum+=hm.get(s.charAt(i));

        int prev=hm.get(s.charAt(i-1));
        int curr=hm.get(s.charAt(i));

        if(prev<curr){
            sum-= 2*(prev);
        }


       }
       return sum;
            

        
    }
}