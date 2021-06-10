import java.util.Scanner;

/**
 * 
 */
//Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algo

/**
 * @author nilesh
 *
 */
public class sort_without_sorting_algo 
{

	public static void main(String[] args) 
	{
		int arr[] =new int[3];
	    Scanner s= new Scanner(System.in);
        System.out.println("Enter "+ 3 +" array elemets");
        for(int i=0; i<3;i++)
        {
            arr[i]=s.nextInt();
        }
        if(arr[0]>arr[1] && arr[0]>arr[2]) 
        {
            if(arr[1]>arr[2]) {
            	System.out.println(""+arr[0]+arr[1]+arr[2]);
            }
            else {
            	System.out.println(""+ ""+arr[0] + ""+arr[2] + arr[1]);
            }

        }
        else if(arr[1]>arr[0] && arr[1]>arr[2]) 
        {
            if(arr[0]>arr[2]) {
            	System.out.println(""+arr[1]+arr[0]+arr[2]);
            }
            else {
            	System.out.println(""+ ""+arr[1] + ""+arr[2] + arr[0]);
            }
        }
        else {
        	if(arr[1]>arr[0]) {
            	System.out.println(""+arr[2]+arr[1]+arr[0]);
            }
            else {
            	System.out.println(""+ ""+arr[2] + ""+arr[0] + arr[1]);
            }
        }
	}

}
