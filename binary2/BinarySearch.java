import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scan =	new Scanner(System.in);
    System.out.println("Enter size of Array");
	int n= scan.nextInt();
	int [] arr=new int [n];
	
	for(int i=0; i<arr.length;i++) {
		System.out.println("Enter element "+i);
		arr [i]=scan.nextInt();
	}
	for(int i=0; i<arr.length;i++) {
		System.out.println(arr[i]+" ");
	}
	
	System.out.print("This is sorted array ");
	Arrays.sort(arr);
	for(int elem:arr) {
		System.out.print(elem + " ");
	}
	
	System.out.println();
	System.out.println("Enter key ");
	int key = scan.nextInt();
	int low =0;
	int high = arr.length-1;
	for(int i=0; i<arr.length; i++) {
		int mid=(high+low)/2;
		if(key==arr[mid]) {
		System.out.println("Found key at index "+mid);
         break;
		}
		else if(key>arr[mid]) {
			low=mid+1;
		}
		else if(key<arr[mid]) {
			high=mid-1;
		}	
	}
	
	if(low>high) {
		System.out.println("key not found ");
	}
	

	}

}