
public class searchIndex
{
    static int SI (int[] arr , int x){
        
        int low = 0 ;
        int ans = arr.length;
        int high = arr.length -1 ;
        while (low<=high){
        int mid = (low+high)/2;
        
         if(arr[mid]>= x){
             ans =  mid;
             high = mid-1;
             
         }else{
             low= mid +1;
             
         }
        }
        return ans;
        
    }
    
    
    
    
	public static void main(String[] args) {
		System.out.println(SI(new int[] {1,12,13,14,15,17,89,100},32));
	}
}