class Solution {
    public int majorityElement(int[] nums) {
        int count =0 ;
        int maxcount = 0;
        for(int x:nums){
            if(count==0){
                maxcount = x ;

            }
            if(x==maxcount){
                count++;
            }else{
                count--;
            }
        }
      return maxcount;
    }
}
    
    
    
        
    

