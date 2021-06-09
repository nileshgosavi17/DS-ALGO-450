
/**
 * @author nilesh
 *
 */
import java.util.*;

public class find_smallest_largest_in_array {

	
	public static void main(String[] args) {
		
		 int min, max=0,n;
		    Scanner s= new Scanner(System.in);
		    System.out.println("Enter your array size");
	        n= s.nextInt();
	        int arr[]=new int[n];
	        System.out.println("Enter "+ n +" array elemets");
	        for(int i=0; i<n;i++)
	        {
	            arr[i]=s.nextInt();
	        }
	        min=arr[0];
	        for(int i=0; i<n;i++)
	        {
	            if(arr[i]>max){
	                max=arr[i];
	            }
	            if (arr[i]<min){
	                min=arr[i];
	            }
	        }
	        System.out.println("Smallest = "+min);
	        System.out.println("Largest = "+max);

	}

}
