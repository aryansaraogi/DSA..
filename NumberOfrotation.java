class Solution {
    public static int findMin(int[] nums) {
     
      int low =0;
      int high = nums.length - 1;
    
       while(low<high){
        int mid = (low + high )/2;
        if (nums[mid ]> nums [high]){
            low = mid +1;   
       
        }
        else high = mid ;
       }

      return  low; 

        

    }
    
    public static void main (String [] args){
        System.out.println(findMin(new int[]{2,3,5,6,1}));
    }
    
    
    
}