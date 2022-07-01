import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class KHY10815 {
	public static int binarysearch(int Ncards[],int num)
	{
		int mid;
		int low=0;
		int high=Ncards.length-1;
		
		while(low<=high)
		{
			mid=(low+high)/2;
			if(Ncards[mid]==num)
			{	return 1;
			
			}
			else if(Ncards[mid]>num)
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
			int Ncard,Mcard;

			do {
				Ncard=Integer.parseInt(input.readLine());
			}while(Ncard<1 && Ncard>500000);
		
			int [] Ncards=new int[Ncard];
			stoken=new StringTokenizer(input.readLine());
			for(int i=0;i<Ncard;i++)
			{
				Ncards[i]=Integer.parseInt(stoken.nextToken());
			}
			
			Arrays.sort(Ncards);
				
			do {
				Mcard=Integer.parseInt(input.readLine());
		    }while(Mcard<1 && Mcard>500000);
		
			int [] Mcards=new int[Mcard];
			stoken=new StringTokenizer(input.readLine());
			for(int i=0;i<Mcard;i++)
			{
				Mcards[i]=Integer.parseInt(stoken.nextToken());
			}	
			int [] Checked=new int [Mcard];
			for(int j=0;j<Mcard;j++)
			{
				int result=binarysearch(Ncards,Mcards[j]);
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

