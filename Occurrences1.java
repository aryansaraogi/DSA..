/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Occurrences1
{
    
 static void  firstandlast(int arr[] ,int x){
     int first = -1;
     int last = -1;
     
     
     for (int i =0;i<= arr.length-1 ;i++){
        if(arr[i]==x){
            if(first == -1) first =i;
            last = i;
        }

     } 
    System.out.print(first+" "+ last);
 }   
    
    
    
	public static void main(String[] args) {

      firstandlast(new int[]{1,2,4,4,5,6,7,10},11);
	}
}