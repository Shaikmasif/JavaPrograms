import java.util.Scanner;

public class InsertonSortApplication {
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
		InsertionSort sort=new InsertionSort();
		sort.insertionSort(arr);
		System.out.println();
		System.out.println("Array element after sorting...");
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}

}
