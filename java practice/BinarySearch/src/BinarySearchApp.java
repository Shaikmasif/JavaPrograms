import java.util.Scanner;

public class BinarySearchApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" elements into the array");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println();
		System.out.println("Array element are...");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Enter the element to be searched in the array");
		int key=scan.nextInt();
		BinarySearch search=new BinarySearch();
		int result=search.binarySearch(arr,key);
		if(result<0)
		{
			System.out.println("Key Not Found");
		}
		else
		{
			System.out.println("Key Found At Index "+result);
		}
	}

}
