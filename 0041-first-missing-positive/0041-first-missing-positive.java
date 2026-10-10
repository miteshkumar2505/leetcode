class Solution {
    public int firstMissingPositive(int[] nums) {
        int i = 0 ;
         int n =nums.length;
         while(i<n){
            int v =nums[i];
            if(v>=1 && v<=n && nums[v-1]!=v){
                int temp = nums[v-1];
                nums[v-1] = nums[i];
                nums[i]=temp;

            }else{
                i++;
            }


            
         } for(int j =0; j<n;j++){
            if(nums[j]!= j+1)
            return j+1;
         }
         return n+1;
        
    }
}