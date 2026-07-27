class Solution {
    public int maxProduct(int[] nums) {
        int maxProduct = 0 ;
        for(int i = 0 ;i<nums.length-1;i++){
            for(int j = i+1;j<nums.length;j++){
                int product =(nums[i]-1)*(nums[j]-1);
                
                    
                if (product>maxProduct){
                    maxProduct = product;
                   
                     maxProduct =Math.max(maxProduct,product);
                }

            }
           
        
        }
           
        return maxProduct ; 
    }
}