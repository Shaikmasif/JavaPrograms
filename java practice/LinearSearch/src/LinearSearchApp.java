import java.util.Scanner;

public class LinearSearchApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" elements into the array");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Array elements before sorting");
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.println("Enter the key to be searched in the array");
		int key=scan.nextInt();
		LinearSearch linearSearch=new LinearSearch();
		int res=linearSearch.search(arr,key);
		if(res<0)
		{
			System.out.println("Key Not Found");
		}
		else
		{
			System.out.println("Key Found At Index "+res);
		}
	}

}
