import java.util.Scanner;

public class SearchingAndSortingApp {
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
		System.out.println("Array elements Before sorting are...");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println("========================================================");
		System.out.println("Choose any of the options from below...");
		System.out.println("1----->BUBBLE SORT");
		System.out.println("2----->SELECTION SORT");
		System.out.println("3----->INSERTION SORT");
		System.out.println("BY DEFAULT SELECTION SORT");
		int choice=scan.nextInt();
		switch(choice)
		{
		case 1:
			SearchingAndSortingTechniques bubblesort=new SearchingAndSortingTechniques();
			bubblesort.bubbleSort(arr);
			break;
			
		case 2:
			SearchingAndSortingTechniques selectionsort=new SearchingAndSortingTechniques();
			selectionsort.selectionSort(arr);
			break;
			
		case 3:
			SearchingAndSortingTechniques insertionsort=new SearchingAndSortingTechniques();
			insertionsort.insertionSort(arr);
			break;
			
		default:
			SearchingAndSortingTechniques sort=new SearchingAndSortingTechniques();
			sort.selectionSort(arr);
			break;
		}
		System.out.println("==========================================================");
		System.out.println("Array elements after sorting...");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println("==========================================================");
		System.out.println("Enter the element to be searched in the array");
		int key=scan.nextInt();
		System.out.println("Select the Algorithm to search the element in the array");
		System.out.println("1----->LINEAR SEARCH");
		System.out.println("2----->BINARY SEARCH");
		int select=scan.nextInt();
		switch(select)
		{
		case 1:
			SearchingAndSortingTechniques linearsearch=new SearchingAndSortingTechniques();
			int result=linearsearch.linearSearch(arr, key);
			if(result<0)
			{
				System.out.println("KEY NOT FOUND....");
			}
			else
			{
				System.out.println("KEY FOUND AT INDEX "+result);
			}
			break;
			
		case 2:
			SearchingAndSortingTechniques binarysearch=new SearchingAndSortingTechniques();
			int res=binarysearch.binarySearch(arr, key);
			if(res<0)
			{
				System.out.println("KEY NOT FOUND....");
			}
			else
			{
				System.out.println("KEY FOUND AT INDEX "+res);
			}
			break;
			
		default:
			SearchingAndSortingTechniques search=new SearchingAndSortingTechniques();
			int reslt=search.binarySearch(arr, key);
			if(reslt<0)
			{
				System.out.println("KEY NOT FOUND....");
			}
			else
			{
				System.out.println("KEY FOUND AT INDEX "+reslt);
			}
			
		}
		
	}

}
