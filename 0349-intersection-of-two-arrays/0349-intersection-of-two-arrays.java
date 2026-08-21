class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer>s1=new HashSet<>();
        Set<Integer>s2=new HashSet<>();

        for(int i:nums1){
            s1.add(i);
        }
        
        for(int i:nums2){
            s2.add(i);
        }
        int k=0;
        int res[]=new int[s1.size()];
        for(int num:s1){
            if(s2.contains(num)){
                res[k]=num;
                k++;

            }
        }

        return Arrays.copyOfRange(res,0,k);
      
       
        
    }
}