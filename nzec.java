import java.io.*;
	import java.util.*;

	public class Main {

	    public static void main(String[] args) throws Exception {
//  The following code is giving nzec error find out why its is? giving this error and resolve the issue
		    // TRied the above code and the error can be due to the input not given 
		    // and secondly if you face such error again embedded the following block in your code
		    /*public class Main
{
	public static void main(String[] args) throws IOException
	{
		try{
			//Your Solve
		}catch(Exception e){
			return;
		}
	}
}*/
	  Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i]=scn.nextInt();
        }
       int max_sum= maxSubArraySum(arr,n);
       System.out.println(max_sum);
     }
        
    
    static int maxSubArraySum(int arr[], int n) {
        
    int max_so_far = arr[0]; 
    int curr_max = arr[0]; 
  
    for (int i = 0; i < arr.length; i++) 
    { 
           curr_max = Math.max(arr[i], curr_max+arr[i]); 
        max_so_far = Math.max(max_so_far, curr_max); 
    } 
    return max_so_far; 
    } 
}
