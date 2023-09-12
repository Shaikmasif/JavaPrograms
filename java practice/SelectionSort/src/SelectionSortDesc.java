
public class SelectionSortDesc {
	void selectionSort(int []arr)
	{
		int max,pos,help;
		for(int i=0;i<=arr.length-2;i++)
		{
			max=arr[i];
			pos=i;
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[j]>max)
				{
					max=arr[j];
					pos=j;
				}
			}
			help=arr[i];
			arr[i]=arr[pos];
			arr[pos]=help;
		}
	}

}
