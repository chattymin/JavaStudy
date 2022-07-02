import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Fall10815 
{
	static int n, m;
	
	static boolean binarysearch(int[] arr, int key)
	{
		int mid;
		int low=0;
		int high=n-1;
		
		while(low <= high)
		{
			mid = (low+high)/2;
			
			if(key == arr[mid])
			{
				return true;
			}
			else if(key < arr[mid])
			{
				high = mid - 1;
			}
			else
			{
				low = mid + 1;
			}
		}
		return false; //Å½»ö ½ÇÆÐ
	}
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> mlist = new ArrayList<Integer>();
		
		n = in.nextInt();
		int arr[] = new int[n]; 
		for(int i=0; i<n; i++)
		{
			arr[i] = in.nextInt();
		}
		
		Arrays.sort(arr);
		
		m = in.nextInt();
		for(int i=0; i<m; i++)
		{
			int num = in.nextInt();
			
			if(binarysearch(arr, num))
			{
				mlist.add(1);
			}
			else
			{
				mlist.add(0);
			}
		}
		for(Integer result : mlist)
		{
			System.out.print(result+" ");
		}
	}
}