package new01;

public class BubbleSort {
	
	public static void bubbleSort(int[] arr)
	{
		int n=arr.length;
		
		for(int i=0;i<n-1;i++)
			for (int j=0;j<n-i-1;j++)
			{
				if (arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1] =temp;
				}
			}
	}

	public static void main(String[] args) {
		int[] arr={54,79,56,12,78,99,47,13};
		
		System.out.println("Array before sort:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"  ");
		}
		bubbleSort(arr);
		
		System.out.println("\n Array After sort:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"  ");
		}
		

	}

}
