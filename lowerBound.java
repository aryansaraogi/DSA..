public class lowerBound
{
    
    static int lb( int [ ] arr ,int x){
        
        int low = 0 ;
        int n = arr.length ; 
        int high = n - 1 ;
        
        while(low <= high){
            int mid = (low + high)/2;
            if (arr[mid]>=x){
                n = mid;
                
                high= mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return n;
    }
	public static void main(String[] args) {
   System.out.println(lb(new int[]{2,34,56,66,77,88,1234},29));
	}
}