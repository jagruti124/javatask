package java_pr;

import java.util.Scanner;



public class HelpDesk {
	public static boolean  checkdesk(int arr[][],int rollno)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(arr[i][j]==rollno)
				{
					
					System.out.println("your bench is "+"row is "+i+" "+"column is" +j);
					return true;
				
				}
				
			}
		}
		return false;
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{33,45,78},{96,21,11},{7,63,13}};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your name");
		String name=sc.next();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Enter Your roll no.");
		int rollno=sc.nextInt();
		
		boolean s=checkdesk(arr,rollno);
		if(s)
		{
			System.out.println("thanks for using Services");
		}
		else
		{
			System.out.println("Sorry is to say you are not allowed");
		}
		
		
		

	}

}