//package pog.expressions;

import java.util.Scanner;

public class Rect 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Size : ");
		int num = sc.nextInt();

		System.out.println("leghts : ");
		int []arr = new int[num];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int x, count = 0, len = 0, bre = 0;
		for (int i = 0; i < arr.length-1; i++)
		{
			x = arr[i];
			count = 1;
			if(len < x || bre < x)
			{
				for (int j = i+1; j < arr.length; j++) 
				{
					if(arr[j] == x)
						count++;
				}
				if(count >= 4)
				{
					if(len < x)
					{
						len = x;
						bre = x;
					}
					else
						bre = x;
				}
				else if(count >= 2)
				{
					if(len < x)
						len = x;
					else
						bre = x;
				}
			}
		}
		System.out.println("Len = "+len+"\nbre = "+bre);

		if(len == 0 || bre ==0)
		{
			System.out.println("-1");
		}
		else
		{
			long mod = 1000000007L, oArea;
			oArea = (((long)len%mod)*((long)bre%mod))%mod;
			int mArea = (int)oArea;
			System.out.println(mArea);
		}
	}
}

/* input
328397875
193019593
930059844
578508352
225034278
786339972
578508352
578508352
193019593
930059844
578508352
328397875

 */
