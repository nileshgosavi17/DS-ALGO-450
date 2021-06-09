
/**
 * @author nilesh
 *
 */
import java.util.*;
public class reverse_array {

	public static void main(String[] args) {

		 int n;
		    Scanner s= new Scanner(System.in);
		    System.out.println("Enter your array size");
	        n= s.nextInt();
	        int arr[]=new int[n];
	        System.out.println("Enter "+ n +" array elemets");
	        for(int i=0; i<n;i++)
	        {
	            arr[i]=s.nextInt();
	        }
	        System.out.println("array" );
	        for(int i=0; i<n;i++)
	        {
	        	System.out.println("" + arr[i]);
	        }
	        System.out.println("Reverse of array");
	        for(int i=0; i<n;i++)
	        {
	        	System.out.println("" + arr[n-1-i]);
	        }
	}

}
