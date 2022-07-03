import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class KHY10815 {
	public static int binarysearch(int nList[],int num)
	{
		int mid;
		int low=0;
		int high=nList.length-1;
		
		while(low<=high)
		{
			mid=(low+high)/2;
			if(nList[mid]==num)
			{	return 1;
			
			}
			else if(nList[mid]>num)
			{
				high=mid-1;
			}
			else
			{
				low=mid+1;
			}
		}
		
		return -1;		
	}
	
	public static void main(String[] args) {
		try {
			BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer stoken;
			int n,m;

			do {
				n=Integer.parseInt(input.readLine());
			}while(n<1 && n>500000);
		
			int [] nList=new int[n];
			stoken=new StringTokenizer(input.readLine());
			for(int i=0;i<n;i++)
			{
				nList[i]=Integer.parseInt(stoken.nextToken());
			}
			
			Arrays.sort(nList);
				
			do {
				m=Integer.parseInt(input.readLine());
		    }while(m<1 && m>500000);
		
			stoken=new StringTokenizer(input.readLine());

			int [] Checked=new int [m];
			for(int j=0;j<m;j++)
			{
				int result=binarysearch(nList,Integer.parseInt(stoken.nextToken()));
				if(result==-1)
				{
					continue;
				}
				else if(result==1)
				{
					Checked[j]=1;
				}
			}
		
			for(int result:Checked)
			{
				System.out.print(result+" ");
			}
		}catch(IOException e)
		{
			System.out.println("ERROR");
		}
	
	}
}

