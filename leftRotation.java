import java.util.Arrays;

public class leftRotation
{
    
    static void lr (int[] arr){
       int n = arr.length ; 
    int temp = arr[0];
    for (int i = 1 ;i<n ;i++ ){
        arr[i-1] = arr[i];
    } 
        arr [ n-1]= temp ;
        
        
        System.out.print(Arrays.toString(arr));
    }
    
    
	public static void main(String[] args) {
      lr( new int[] {2,3,4,5,6,7});
	}
}