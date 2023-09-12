import java.util.Scanner;

public class BubbleSortApplicationDesc {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array lenght");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" elements into the array");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Array elements before sorting");
		for(int x:arr)
		{
			System.out.println(x+" ");
		}
		BubbleSortDesc sort=new BubbleSortDesc();
		sort.bubbleSort(arr);
		System.out.println("Array element after sorting...");
		for (int i : arr) {
			System.out.println(i+" ");
		}
	}


}
