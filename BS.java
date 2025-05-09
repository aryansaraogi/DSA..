

public class BS
{
    static int bs (int [ ] arr , int target){
        int n = arr.length;
        int low = 0;
        int high = n ;

        while (low <= high){
          int  mid = (low+high)/2;
            
            if (arr[mid]==target)  return mid;
        
        
        else if  (target > arr[mid])  low = mid +1;
        else high = mid-1;
        }
        return -1 ;
    }
    
    
    
	public static void main(String[] args) {

    System.out.println(bs( new int[] {2,3,4,5,7,89,120} ,120) ); 

	}
}